public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;

    public volatile static ChocolateBoiler instance;

    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    public static synchronized ChocolateBoiler getInstance() {
        if (instance == null)
            synchronized (ChocolateBoiler.class) {
                if (instance == null)
                    return new ChocolateBoiler();
            }
        return instance;
    }

    public void fill() {
        if(isEmpty()) {
            empty = false;
            boiled = false;
            // Fill the boiler with a milk / chocolate mixture
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            // drain the boiled milk and chocolate
            empty = true;
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            // Bring the contents to a boil
            boiled = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}

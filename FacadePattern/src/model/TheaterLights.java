package model;

public class TheaterLights {

    public void on() {
        System.out.println(getClass().getName() + " ON");
    }

    public void off() {
        System.out.println(getClass().getName() + " OFF");
    }

    public void dim(int dim) {
        System.out.println(getClass().getName() + " DIM" + dim);
    }

}

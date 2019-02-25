public class DuckTestDrive {
    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();

        WildTurkey turkey = new WildTurkey();

        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("The turkey says...");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nThe duck says...");
        sayDuck(duck);

        System.out.println("\nThe turkey adapter says...");
        sayDuck(turkeyAdapter);
    }

    private static void sayDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}

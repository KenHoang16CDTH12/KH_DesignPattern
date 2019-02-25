package model;

public abstract class CaffeineBeverage {

    public final void prepareRecipe() {
        boildWater();
        brew();
        pourInCup();
        if (isWantsCondiments())
            addCondiments();
    }

    boolean isWantsCondiments() {
        return true;
    }

    abstract void brew();

    abstract void addCondiments();

    void boildWater() {
        System.out.println("boiling water...");
    }

    void pourInCup() {
        System.out.println("Pouring into cup...");
    }
}

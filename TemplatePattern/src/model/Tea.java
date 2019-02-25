package model;

public class Tea {
    void prepareRecipe() {
        boilWater();
        steepTeaBag();
        pourInCup();
        addLemon();
    }

    private void addLemon() {
        System.out.println("Boiling water");
    }

    private void pourInCup() {
        System.out.println("Dripping coffee through filter");
    }

    private void steepTeaBag() {
        System.out.println("Pouring into cup");
    }

    public void boilWater() {
        System.out.println("Adding sugar and milk");
    }
}

package model.ingredient;

import model.ingredient.cheese.Cheese;
import model.ingredient.clam.Clams;
import model.ingredient.clam.FrozenClams;
import model.ingredient.dough.Dough;
import model.ingredient.dough.ThickCrustDough;
import model.ingredient.peppermi.Pepperoni;
import model.ingredient.peppermi.SlicedPepperoni;
import model.ingredient.sauce.PlumTomatoSauce;
import model.ingredient.sauce.Sauce;
import model.ingredient.veggie.*;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return null;
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = { new BlackOlives(), new Spinach(), new EggPlant(), new Mozzarella() };
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClams() {
        return new FrozenClams();
    }
}

package model.ingredient;

import model.ingredient.cheese.Cheese;
import model.ingredient.cheese.ReggianoCheese;
import model.ingredient.clam.Clams;
import model.ingredient.clam.FreshClams;
import model.ingredient.dough.Dough;
import model.ingredient.dough.ThinCrustDough;
import model.ingredient.peppermi.Pepperoni;
import model.ingredient.peppermi.SlicedPepperoni;
import model.ingredient.sauce.MarinaraSauce;
import model.ingredient.sauce.Sauce;
import model.ingredient.veggie.*;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = { new Garlic(), new Onion(), new Mushroom(), new Redpepper() };
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClams() {
        return new FreshClams();
    }
}

package model.ingredient;

import model.ingredient.cheese.Cheese;
import model.ingredient.clam.Clams;
import model.ingredient.dough.Dough;
import model.ingredient.peppermi.Pepperoni;
import model.ingredient.sauce.Sauce;
import model.ingredient.veggie.Veggies;

public interface PizzaIngredientFactory {

    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClams();

}

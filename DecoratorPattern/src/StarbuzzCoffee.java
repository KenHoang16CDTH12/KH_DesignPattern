import model.Beverage;
import model.DarkRoast;
import model.Espresso;
import model.HouseBlend;
import model.decorator.Mocha;
import model.decorator.Soy;
import model.decorator.Whip;

public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        beverage.setSize(Beverage.Size.GRANDE);
        System.out.println(beverage.getDescription() + " size: " + beverage.getSize() + " $" + beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2.setSize(Beverage.Size.TALL);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        beverage2 = new Soy(beverage2);
        System.out.println(beverage2.getDescription() + " size: " + beverage2.getSize() + " $" + beverage2.cost());

        Beverage beverage3 = new HouseBlend();
        beverage3.setSize(Beverage.Size.VENTI);
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() + " size: " + beverage3.getSize() + " $" + beverage3.cost());
    }
}

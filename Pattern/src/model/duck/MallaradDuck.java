package model.duck;

import behavior.fly.FlyWithWings;
import behavior.quack.Quack;
import model.Duck;

public class MallaradDuck extends Duck {

    public MallaradDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}

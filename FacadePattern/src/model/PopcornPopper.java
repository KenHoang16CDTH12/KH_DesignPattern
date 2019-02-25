package model;

public class PopcornPopper {

    public void on() {
        System.out.println(getClass().getName() + " ON");
    }

    public void off() {
        System.out.println(getClass().getName() + " OFF");
    }

    public void pop() {
        System.out.println(getClass().getName() + " POP");
    }

}

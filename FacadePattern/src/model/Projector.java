package model;

public class Projector {

    DvdPlayer dvdPlayer;

    public void on() {
        System.out.println(getClass().getName() + " ON");
    }

    public void off() {
        System.out.println(getClass().getName() + " OFF");
    }

    public void tvMode() {
        System.out.println(getClass().getName() + " TV MODE");
    }

    public void wideScreenMode() {
        System.out.println(getClass().getName() + " WIDE SCREEN MODE");
    }
}

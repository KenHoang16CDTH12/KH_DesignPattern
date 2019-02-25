package model;

public class CdPlayer {
    Amplifer amplifer;

    public void on() {
        System.out.println(getClass().getName() + " ON");
    }

    public void off() {
        System.out.println(getClass().getName() + " OFF");
    }

    public void eject() {
        System.out.println(getClass().getName() + " EJECT");
    }

    public void pause() {
        System.out.println(getClass().getName() + " PAUSE");
    }

    public void play() {
        System.out.println(getClass().getName() + " PLAY");
    }

    public void stop() {
        System.out.println(getClass().getName() + " STOP");
    }
}

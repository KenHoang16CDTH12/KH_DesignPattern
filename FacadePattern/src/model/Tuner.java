package model;

public class Tuner {
    Amplifer amplifer;

    public void on() {
        System.out.println(getClass().getName() + " ON");
    }

    public void off() {
        System.out.println(getClass().getName() + " OFF");
    }

    public void setAm() {
        System.out.println(getClass().getName() + " SET AM");
    }

    public void setFM() {
        System.out.println(getClass().getName() + " SET FM");
    }

    public void setFrequency() {
        System.out.println(getClass().getName() + " SET FREQUENCY");
    }
}

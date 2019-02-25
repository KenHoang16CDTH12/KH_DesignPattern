package model;

public class Amplifer {
    Tuner tuner;
    DvdPlayer dvdPlayer;
    CdPlayer cdPlayer;

    public void on() {
        System.out.println(getClass().getName() + " ON");
    }

    public void off() {
        System.out.println(getClass().getName() + " OFF");
    }

    public void setCd() {
        System.out.println(getClass().getName() + " SET CD");
    }

    public void setDvd(DvdPlayer dvd) {
        System.out.println(getClass().getName() + " SET DVD " + dvd.toString());
    }

    public void setStereoSound() {
        System.out.println(getClass().getName() + " SET SETEREO  SOUND");
    }

    public void setSurroundSound() {
        System.out.println(getClass().getName() + " SET SURROUND SOUND");
    }

    public void setTunner() {
        System.out.println(getClass().getName() + " SET TUNNER");
    }

    public void setVolume(int volume) {
        System.out.println(getClass().getName() + " SET VOLUME " + volume);
    }
}

package model;

public class DvdPlayer {

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

    public void play(String movie) {
        System.out.println(getClass().getName() + " PLAY " + movie);
    }

    public void setSurroundAudio() {
        System.out.println(getClass().getName() + " SET SURROUND AUDIO");
    }

    public void setTwoChannelAudio() {
        System.out.println(getClass().getName() + " SET TWO CHANNEL AUDIO");
    }

    public void stop() {
        System.out.println(getClass().getName() + " STOP");
    }

}

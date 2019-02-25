package model;

public class TV {
    public void on() {
        System.out.println("TV on");
    }

    public void off() {
        System.out.println("TV off");
    }

    public void setInputChannel() {
        System.out.println("TV set input channel");
    }

    public void setVolume(int volume) {
        System.out.println("TV set Volume " + volume);
    }
}

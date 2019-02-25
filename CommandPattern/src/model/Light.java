package model;

public class Light {

    String room;

    public Light(String room) {
        this.room = room;
    }

    public void on() {
        System.out.println(room + " room light is on");
    }

    public void off() {
        System.out.println(room + "room light is off");
    }
}

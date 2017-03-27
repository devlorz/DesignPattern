package com.leeway.CommandPattern.GarageDoor;

/**
 * Created by DEV-PC5 on 2017/03/27.
 */
public class GarageDoor {
    String room;

    public GarageDoor(String room) {
        this.room = room;
    }

    public void up() {
        print("Garage Door is Open");
    }

    public void down() {
        print("Garage Door is Close");
    }

    public void stop() {

    }

    public void lightOn() {

    }

    public void lightOff() {

    }

    private void print(String output) {
        if (room.isEmpty()) System.out.println(output);
        else System.out.println(room + ": " + output);
    }
}

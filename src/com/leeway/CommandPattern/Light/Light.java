package com.leeway.CommandPattern.Light;

/**
 * Created by DEV-PC5 on 2017/03/27.
 */
public class Light {
    String room;

    public Light(String room) {
        this.room = room;
    }

    public void on() {
        print("Light On!");
    }

    public void off() {
        print("Light Off!");
    }

    private void print(String output) {
        if (room.isEmpty()) System.out.println(output);
        else System.out.println(room + ": " + output);
    }
}

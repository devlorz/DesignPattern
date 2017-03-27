package com.leeway.CommandPattern.CeilingFan;

/**
 * Created by DEV-PC5 on 2017/03/27.
 */
public class CeilingFan {
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    String room;
    int speed;

    public CeilingFan(String room) {
        this.room = room;
        speed = OFF;
    }

    public void high() {
        speed = HIGH;
        print("Ceiling fan is on high");
    }

    public void medium() {
        speed = MEDIUM;
        print("Ceiling fan is on medium");
    }

    public void low() {
        speed = LOW;
        print("Ceiling fan is on low");
    }

    public void off() {
        speed = OFF;
        print("Ceiling fan is off");
    }

    public int getSpeed() {
        return speed;
    }

    private void print(String output) {
        if (room.isEmpty()) System.out.println(output);
        else System.out.println(room + ": " + output);
    }
}

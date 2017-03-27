package com.leeway.CommandPattern.Stereo;

/**
 * Created by DEV-PC5 on 2017/03/27.
 */
public class Stereo {
    String room;

    public Stereo(String room) {
        this.room = room;
    }

    public void on() {
        print("Stereo On!");
    }

    public void off() {
        print("Stereo Off!");
    }

    public void setCd() {
        print("Stereo Set CD!");
    }

    public void setDvd() {
        print("Stereo Set DVD!");
    }

    public void setRadio() {
        print("Stereo Set Radio!");
    }

    public void setVolume(Integer volume) {
        print("Stereo Set Volume: " + volume);
    }

    private void print(String output) {
        if (room.isEmpty()) System.out.println(output);
        else System.out.println(room + ": " + output);
    }
}

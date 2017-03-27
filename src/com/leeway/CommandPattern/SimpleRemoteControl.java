package com.leeway.CommandPattern;

/**
 * Created by DEV-PC5 on 2017/03/27.
 */
public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl() {

    }

    public void setCommand(Command command) {
        slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}

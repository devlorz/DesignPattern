package com.leeway.CommandPattern.Light;

import com.leeway.CommandPattern.Command;

/**
 * Created by DEV-PC5 on 2017/03/27.
 */
public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}

package com.leeway.CommandPattern.Light;

import com.leeway.CommandPattern.Command;

/**
 * Created by DEV-PC5 on 2017/03/27.
 */
public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}

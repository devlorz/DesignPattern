package com.leeway.CommandPattern.Stereo;

import com.leeway.CommandPattern.Command;

/**
 * Created by DEV-PC5 on 2017/03/27.
 */
public class StereoOffCommand implements Command {
    Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }

    @Override
    public void undo() {
        stereo.on();
    }
}

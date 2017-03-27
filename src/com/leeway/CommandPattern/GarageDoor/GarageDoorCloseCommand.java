package com.leeway.CommandPattern.GarageDoor;

import com.leeway.CommandPattern.Command;

/**
 * Created by DEV-PC5 on 2017/03/27.
 */
public class GarageDoorCloseCommand implements Command {
    GarageDoor garageDoor;

    public GarageDoorCloseCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.down();
    }

    @Override
    public void undo() {
        garageDoor.up();
    }
}

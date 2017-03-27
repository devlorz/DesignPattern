package com.leeway.CommandPattern;

import com.leeway.CommandPattern.GarageDoor.GarageDoor;
import com.leeway.CommandPattern.GarageDoor.GarageDoorOpenCommand;
import com.leeway.CommandPattern.Light.Light;
import com.leeway.CommandPattern.Light.LightOnCommand;

/**
 * Created by DEV-PC5 on 2017/03/27.
 */
public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light("");
        LightOnCommand lightOn = new LightOnCommand(light);
        GarageDoor garage = new GarageDoor("");
        GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garage);

        remote.setCommand(lightOn);
        remote.buttonWasPressed();
        remote.setCommand(garageOpen);
        remote.buttonWasPressed();
    }
}

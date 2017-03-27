package com.leeway.CommandPattern;

import com.leeway.CommandPattern.CeilingFan.CeilingFan;
import com.leeway.CommandPattern.CeilingFan.CeilingFanHighCommand;
import com.leeway.CommandPattern.CeilingFan.CeilingFanMediumCommand;
import com.leeway.CommandPattern.CeilingFan.CeilingFanOffCommand;
import com.leeway.CommandPattern.GarageDoor.GarageDoor;
import com.leeway.CommandPattern.GarageDoor.GarageDoorCloseCommand;
import com.leeway.CommandPattern.GarageDoor.GarageDoorOpenCommand;
import com.leeway.CommandPattern.Light.Light;
import com.leeway.CommandPattern.Light.LightOffCommand;
import com.leeway.CommandPattern.Light.LightOnCommand;
import com.leeway.CommandPattern.Stereo.Stereo;
import com.leeway.CommandPattern.Stereo.StereoOffCommand;
import com.leeway.CommandPattern.Stereo.StereoOnWithCDCommand;

import javax.crypto.Mac;

/**
 * Created by DEV-PC5 on 2017/03/27.
 */
public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        GarageDoor garageDoor = new GarageDoor("");
        Stereo stereo = new Stereo("Living Room");

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);;
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand(garageDoor);
        GarageDoorCloseCommand garageDoorClose = new GarageDoorCloseCommand(garageDoor);

        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);
//
//        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
//        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
//        remoteControl.setCommand(2, stereoOnWithCD, stereoOff);

        //System.out.println(remoteControl);

//        remoteControl.onButtonWasPushed(0);
//        remoteControl.offButtonWasPushed(0);
//        System.out.println(remoteControl);
//        remoteControl.undoButtonWasPushed();
//        remoteControl.offButtonWasPushed(0);
//        remoteControl.onButtonWasPushed(0);
//        System.out.println(remoteControl);
//        remoteControl.undoButtonWasPushed();
//
//        remoteControl.onButtonWasPushed(1);
//        remoteControl.offButtonWasPushed(1);
//        remoteControl.onButtonWasPushed(2);
//        remoteControl.offButtonWasPushed(2);

        CeilingFan ceilingFan = new CeilingFan("Living Room");
        CeilingFanMediumCommand ceilingFanMedium = new CeilingFanMediumCommand(ceilingFan);
        CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

//        remoteControl.setCommand(0, ceilingFanMedium, ceilingFanOff);
//        remoteControl.setCommand(1, ceilingFanHigh, ceilingFanOff);
//
//        remoteControl.onButtonWasPushed(0);
//        remoteControl.offButtonWasPushed(0);
//        System.out.println(remoteControl);
//        remoteControl.undoButtonWasPushed();
//
//        remoteControl.onButtonWasPushed(1);
//        System.out.println(remoteControl);
//        remoteControl.undoButtonWasPushed();

        Command[] partyOn = { livingRoomLightOn, stereoOnWithCD, ceilingFanHigh };
        Command[] partyOff = { livingRoomLightOff, stereoOff, ceilingFanOff };

        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);

        remoteControl.setCommand(0, partyOnMacro, partyOffMacro);

        System.out.println(remoteControl);
        System.out.println("--- Pushing Macro On ---");
        remoteControl.onButtonWasPushed(0);
        System.out.println("--- Pushing Macro Off ---");
        remoteControl.offButtonWasPushed(0);
    }
}

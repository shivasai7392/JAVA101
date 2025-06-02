package CommandPattern;

import java.util.ArrayList;
import java.util.List;

public class CommandPatternDesign {
    public static void main(String[] args) {
        RemoteControl rc = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        CeilingFan livingRoomCeilingFan = new CeilingFan("Living Room");
        GarageDoor garageDoor = new GarageDoor();
        Stereo livingRoomStereo = new Stereo("Living Room");

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        CeilingfanHighCommand ceilingfanHighCommand = new CeilingfanHighCommand(livingRoomCeilingFan);
        CeilingfanOnCommand ceilingfanOnCommand = new CeilingfanOnCommand(livingRoomCeilingFan);
        CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(livingRoomCeilingFan);

        StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(livingRoomStereo);
        SteroOffCommand stereoOffCommand = new SteroOffCommand(livingRoomStereo);

        GarageDoorUpCommand garageDoorUpCommand = new GarageDoorUpCommand(garageDoor);
        GarageDoorDownCommand garageDoorDownCommand = new GarageDoorDownCommand(garageDoor);

        List<Command> commands = new ArrayList<Command>();
        commands.add(livingRoomLightOn);
        commands.add(stereoOnWithCDCommand);
        commands.add(ceilingfanOnCommand);
        MacroCommand macroCommand = new MacroCommand(commands);

        List<Command> offCommands = new ArrayList<>();
        offCommands.add(livingRoomLightOff);
        offCommands.add(stereoOffCommand);
        offCommands.add(ceilingFanOffCommand);
        MacroOffCommand macroOffCommand = new MacroOffCommand(offCommands);

        rc.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        rc.setCommand(1, ceilingfanOnCommand, ceilingFanOffCommand);
        rc.setCommand(2, ceilingfanHighCommand, ceilingFanOffCommand);
        rc.setCommand(3, stereoOnWithCDCommand, stereoOffCommand);
        rc.setCommand(4, garageDoorUpCommand, garageDoorDownCommand);
        rc.setCommand(5, macroCommand, macroOffCommand);

        rc.onbuttonWasPressed(5);
        rc.undobuttonWasPressed();

//        rc.offbuttonWasPressed(0);
//        rc.onbuttonWasPressed(0);
//        System.out.println(rc);
//        rc.undobuttonWasPressed();

    }
}

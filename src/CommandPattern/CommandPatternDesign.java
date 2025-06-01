package CommandPattern;

public class CommandPatternDesign {
    public static void main(String[] args) {
        RemoteControl rc = new RemoteControl();

        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);


        GarageDoor garageDoor = new GarageDoor();
        GarageDoorOpenCommand garageDoorOpemCommand = new GarageDoorOpenCommand(garageDoor);

        rc.setCommand(0, lightOnCommand, lightOffCommand);
        rc.onbuttonWasPressed(0);
        rc.offbuttonWasPressed(0);
    }
}

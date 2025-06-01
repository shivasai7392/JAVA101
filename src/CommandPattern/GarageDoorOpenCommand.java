package CommandPattern;

public class GarageDoorOpenCommand implements Command {
    private GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        this.garageDoor.lightOn();
        this.garageDoor.up();
        this.garageDoor.stop();
    }

    @Override
    public void undo() {
        this.garageDoor.lightOff();
        this.garageDoor.down();
        this.garageDoor.stop();
    }
}

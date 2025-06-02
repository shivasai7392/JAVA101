package CommandPattern;

public class GarageDoorUpCommand implements Command {
    private GarageDoor garageDoor;

    public GarageDoorUpCommand(GarageDoor garageDoor) {
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

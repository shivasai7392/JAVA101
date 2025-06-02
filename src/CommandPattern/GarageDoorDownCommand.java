package CommandPattern;

public class GarageDoorDownCommand implements Command {
    GarageDoor garageDoor;

    public GarageDoorDownCommand(GarageDoor gd) {
        this.garageDoor = gd;
    }

    @Override
    public void execute() {
        this.garageDoor.lightOff();
        this.garageDoor.down();
        this.garageDoor.stop();
    }

    @Override
    public void undo() {
        this.garageDoor.lightOn();
        this.garageDoor.up();
        this.garageDoor.stop();
    }
}

package CommandPattern;

public class CeilingfanOnCommand implements Command {
    CeilingFan ceilingFan;

    public CeilingfanOnCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        this.ceilingFan.medium();
    }

    @Override
    public void undo() {
        this.ceilingFan.off();
    }
}

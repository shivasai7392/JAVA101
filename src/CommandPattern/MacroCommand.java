package CommandPattern;

import java.util.List;

public class MacroCommand implements Command {
    List<Command> commandList;

    public MacroCommand(List<Command> commandList) {
        this.commandList = commandList;
    }

    @Override
    public void execute() {
        for (Command command : commandList) {
            command.execute();
        }
    }

    @Override
    public void undo() {
        for (Command command : commandList) {
            command.undo();
        }
    }
}

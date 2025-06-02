package CommandPattern;

import java.util.List;

public class MacroOffCommand implements Command {
    List<Command> commandList;

    public MacroOffCommand(List<Command> commandList) {
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

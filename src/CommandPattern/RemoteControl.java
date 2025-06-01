package CommandPattern;

import java.util.ArrayList;
import java.util.List;

public class RemoteControl {
    private final List<Command> onCommands;
    private final List<Command> offCommands;
    private List<Command> lastCommands;

    public RemoteControl() {
        onCommands = new ArrayList<>();
        offCommands = new ArrayList<>();
        lastCommands = new ArrayList<>();
        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands.add(noCommand);
            offCommands.add(noCommand);
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
       onCommands.set(slot, onCommand);
       offCommands.set(slot, offCommand);
    }

    public void onbuttonWasPressed(int slot) {
        onCommands.get(slot).execute();
        lastCommands.add(onCommands.get(slot));
    }

    public void offbuttonWasPressed(int slot) {
        offCommands.get(slot).execute();
        lastCommands.add(offCommands.get(slot));
    }

    public void undobuttonWasPressed() {
        if (lastCommands.isEmpty()) {
            return;
        }
        Command lastCommand = lastCommands.get(lastCommands.size() - 1);
        lastCommand.undo();
        lastCommands.remove(lastCommands.size() - 1);
    }
}

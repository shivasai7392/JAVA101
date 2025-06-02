package CommandPattern;

import java.util.ArrayList;
import java.util.List;

public class RemoteControl {
    private final List<Command> onCommands;
    private final List<Command> offCommands;
    private Command undoCommand;

    public RemoteControl() {
        onCommands = new ArrayList<>();
        offCommands = new ArrayList<>();
        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands.add(noCommand);
            offCommands.add(noCommand);
        }
        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
       onCommands.set(slot, onCommand);
       offCommands.set(slot, offCommand);
    }

    public void onbuttonWasPressed(int slot) {
        onCommands.get(slot).execute();
        undoCommand = onCommands.get(slot);
    }

    public void offbuttonWasPressed(int slot) {
        offCommands.get(slot).execute();
       undoCommand = offCommands.get(slot);
    }

    public void undobuttonWasPressed() {
        undoCommand.undo();
    }

    public String toString(){
        StringBuilder str = new StringBuilder();
        str.append("\n-----------Remote Control----------\n");
        for (int i = 0; i < onCommands.size(); i++) {
            str.append("[slot ").append(i).append("] ").append(onCommands.get(i).getClass().getName()).append("   ").append(offCommands.get(i).getClass().getName()).append("\n");
        }
        str.append("[undo] ").append(undoCommand.getClass().getName());
        return str.toString();
    }
}

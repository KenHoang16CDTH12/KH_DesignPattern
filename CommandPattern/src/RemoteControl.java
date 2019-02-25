import command.Command;
import command.NoCommand;

public class RemoteControl {
    Command[] onCommands;
    Command[] offComands;
    Command unCommand;

    public RemoteControl() {
        onCommands = new Command[7];
        offComands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offComands[i] = noCommand;
        }
        unCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offComands[slot] = offCommand;
    }

    public void onButtonWasPressed(int slot) {
        onCommands[slot].execute();
        unCommand = onCommands[slot];
    }

    public void offButtonWasPressed(int slot) {
        offComands[slot].execute();
        unCommand = offComands[slot];
    }

    public void undo() {
        unCommand.undo();
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n------ Remote Control ------\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuffer.append("[slot " + i + "] " + onCommands[i].getClass().getName()
             + "    " + offComands[i].getClass().getName() + "\n");
        }
        return stringBuffer.toString();
    }
}

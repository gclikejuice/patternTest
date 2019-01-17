package command.controller;

import command.command.Command;

/**
 * @ClassName Controller
 * @Description TODO
 * @Author gclikejuice
 **/
public class Controller {
    protected Command[] commandsOn;
    protected Command[] commandsOff;
    private Command currentCommand;

    public void setCommands(int slot, Command commandOn, Command commanOff) {
        commandsOn[slot] = commandOn;
        commandsOff[slot] = commanOff;
    }

    public void commandsOnPush(int slot) {
        commandsOn[slot].excute();
        currentCommand = commandsOn[slot];
    }

    public void commandsOffPush(int slot) {
        commandsOff[slot].excute();
        currentCommand = commandsOff[slot];
    }

    public void undo() {
        currentCommand.undo();
    }
}

package command;

import command.command.CommandDoorClose;
import command.command.CommandDoorOpen;
import command.command.CommandFanOff;
import command.command.CommandFanOn;
import command.controller.RemoteController;

/**
 * @ClassName Test
 * @Description TODO
 * @Author gclikejuice
 **/
public class Test {
    public static void main(String[] args) {
        RemoteController controller = new RemoteController();

        controller.setCommands(1, new CommandDoorOpen(), new CommandDoorClose());
        controller.setCommands(2, new CommandFanOn(), new CommandFanOff());

        controller.commandsOnPush(1);
        controller.undo();
        controller.commandsOffPush(1);
        controller.undo();

        controller.commandsOnPush(2);
        controller.commandsOffPush(2);
        controller.undo();
    }
}

package command.controller;

import command.command.Command;
import command.command.NoCommand;

/**
 * @ClassName RemoteController
 * @Description TODO
 * @Author gclikejuice
 **/
public class RemoteController extends Controller {
    public RemoteController() {
        commandsOn = new Command[3];
        commandsOff = new Command[3];
        for (int i = 0; i < 3; i++) {
            commandsOn[i] = new NoCommand();
            commandsOff[i] = new NoCommand();
        }
    }
}

package command.command;

/**
 * @ClassName CommandFanOff
 * @Description TODO
 * @Author gclikejuice
 **/
public class CommandFanOff implements Command {
    public void excute() {
        System.out.println("巴拉巴拉，风扇关了！");
    }

    public void undo() {
        System.out.println("啦啦，风扇开了");
    }
}

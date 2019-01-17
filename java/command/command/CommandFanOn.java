package command.command;

/**
 * @ClassName CommandFanOn
 * @Description TODO
 * @Author gclikejuice
 **/
public class CommandFanOn implements Command {

    public void excute() {
        System.out.println("巴拉巴拉，风扇开啦！");
    }

    public void undo() {
        System.out.println("啦啦啦，风扇关了！");
    }
}

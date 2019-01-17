package command.command;

/**
 * @ClassName CommandDoorClose
 * @Description TODO
 * @Author gclikejuice
 **/
public class CommandDoorClose implements Command {
    public void excute() {
        System.out.println("巴拉巴拉，门关了！！");
    }

    public void undo() {
        System.out.println("啦啦啦，门开了！！");
    }
}

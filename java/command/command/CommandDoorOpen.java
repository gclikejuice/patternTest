package command.command;

/**
 * @ClassName CommandDoorOpen
 * @Description TODO
 * @Author gclikejuice
 **/
public class CommandDoorOpen implements Command {
    public void excute() {
        System.out.println("巴拉巴拉，门开啦！！");
    }

    public void undo() {
        System.out.println("啦啦啦，门关了！！");
    }
}

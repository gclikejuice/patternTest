package command.command;

/**
 * @ClassName CommandLightOff
 * @Description TODO
 * @Author gclikejuice
 **/
public class CommandLightOff implements Command {
    public void excute() {
        System.out.println("巴拉巴拉，灯关闭");
    }

    public void undo() {
        System.out.println("啦啦啦，灯打开");
    }
}

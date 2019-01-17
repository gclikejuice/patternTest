package command.command;

/**
 * @ClassName CommandLightOn
 * @Description TODO
 * @Author gclikejuice
 **/
public class CommandLightOn implements Command {

    public void excute() {
        System.out.println("巴拉巴拉，灯打开!");
    }

    public void undo() {
        System.out.println("啦啦啦，灯关闭");
    }
}

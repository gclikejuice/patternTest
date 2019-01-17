package command.command;

/**
 * @ClassName NoCommand
 * @Description TODO
 * @Author gclikejuice
 **/
public class NoCommand implements Command {
    public void excute() {
        System.out.println("null");
    }

    public void undo() {
        System.out.println("null");
    }
}

package adapter.target;

/**
 * @ClassName Duck
 * @Description TODO
 * @Author gclikejuice
 **/
public class Duck implements DuckInterface {
    public void bark() {
        System.out.println("嘎嘎嘎");
    }

    public void fly() {
        System.out.println("啪啪啪");
    }
}

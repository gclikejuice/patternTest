package adapter.impleInterface;

/**
 * @ClassName Dog
 * @Description TODO
 * @Author gclikejuice
 **/
public class Dog implements DogInterface{
    public void bark() {
        System.out.println("汪汪汪");
    }

    public void run() {
        System.out.println("咻咻咻");
    }
}

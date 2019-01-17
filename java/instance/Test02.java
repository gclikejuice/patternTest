package instance;

/**
 * @ClassName Test02
 * @Description TODO
 * @Author gclikejuice
 **/
public class Test02 implements Runnable {

    private Car car;

    public void run() {
        car = Car.getInstance();
        System.out.println(car);
    }
}

package instance;

/**
 * @ClassName Car
 * @Description TODO
 * @Author gclikejuice
 **/
public class Car {
    private static Car car = null;

    public static Car getInstance(){
        if(car == null){
            car = new Car();
        }
        return car;
    }
    private Car(){}

    public void drive(){
        System.out.println("didididi");
    }

    public void addOil(){
        System.out.println("吨吨吨");
    }
}

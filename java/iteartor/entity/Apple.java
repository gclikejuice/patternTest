package iteartor.entity;

/**
 * @ClassName Apple
 * @Description TODO
 * @Author gclikejuice
 **/
public class Apple {
    private String brand;
    public Apple(String brand){
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "brand = "+brand;
    }
}

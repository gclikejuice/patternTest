package adapter.adapt;

import adapter.impleInterface.DogInterface;
import adapter.target.DuckInterface;

/**
 * @ClassName DuckAdapter
 * @Description TODO
 * @Author gclikejuice
 **/
public class DuckAdapter implements DuckInterface {

    private DogInterface dog;

    public DuckAdapter(DogInterface dog){
        this.dog = dog;
    }

    public void bark() {
        dog.bark();
    }

    public void fly() {
        dog.run();
    }
}

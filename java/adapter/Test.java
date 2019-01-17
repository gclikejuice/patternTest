package adapter;

import adapter.adapt.DuckAdapter;
import adapter.impleInterface.Dog;
import adapter.impleInterface.DogInterface;
import adapter.target.Duck;
import adapter.target.DuckInterface;

/**
 * @ClassName Test
 * @Description TODO
 * @Author gclikejuice
 **/
public class Test {
    public static void main(String[] args) {
        DogInterface dog = new Dog();
        DuckInterface duck = new Duck();

        DuckInterface adapter = new DuckAdapter(dog);

        dog.bark();
        dog.run();

        duck.bark();
        duck.fly();

        adapter.bark();
        adapter.fly();
    }
}

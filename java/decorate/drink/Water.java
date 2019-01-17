package decorate.drink;

public class Water extends Drink {

    @Override
    public String getDescription() {
        return "water!";
    }

    @Override
    public double cost() {
        return 2.0;
    }
}

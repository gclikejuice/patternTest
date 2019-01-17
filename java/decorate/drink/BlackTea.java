package decorate.drink;


public class BlackTea extends Drink {

    @Override
    public String getDescription() {
          return "black tea!";
    }

    @Override
    public double cost() {
        return 3.0;
    }
}

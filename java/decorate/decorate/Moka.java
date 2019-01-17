package decorate.decorate;

import decorate.drink.Drink;

public class Moka extends decorate.decorate.Decorate {

    // 一份摩卡 加价0.8块

    private Drink drink;
    private final double cost = 0.8;

    public Moka(Drink drink){
        this.drink = drink;
    }

    @Override
    public String getDescription() {
        return drink.getDescription() + "add moka";
    }

    @Override
    public double cost() {
        return cost + drink.cost();
    }
}

package decorate.decorate;

import decorate.drink.Drink;

public class Candy extends decorate.decorate.Decorate {

    // 加糖 一份0.7块

    private Drink drink;

    private final double cost = 0.7;

    public Candy(Drink drink){
        this.drink = drink;
    }

    @Override
    public String getDescription() {
        return drink.getDescription()+"add candy";
    }

    @Override
    public double cost() {
        return cost + drink.cost();
    }
}

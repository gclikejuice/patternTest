package decorate;


import decorate.decorate.Candy;
import decorate.decorate.Moka;
import decorate.drink.BlackTea;

public class test {
    public static void main(String[] args) {
        decorate.drink.Drink drink = new BlackTea();
        drink = new Candy(drink);
        drink = new Candy(drink);
        drink = new Moka(drink);

        System.out.println("你点的是"+drink.getDescription());
        System.out.println("总价为"+drink.cost());
    }
}

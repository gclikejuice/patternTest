package factory;

import factory.enums.PizzaType;
import factory.pizza.Pizza;
import factory.pizzaFactory.SimplePizzaAbstrFactory;
import factory.pizzaFactory.SimplePizzaAbstrFactory01;
import factory.pizzaFactory.SimplePizzaFactory;

public class test {
    public static void main(String[] args) {
        Pizza pizza = SimplePizzaFactory.createPizza(PizzaType.PIZZA_1);
        System.out.println(pizza.getDescription());
        System.out.println("pizza的价格为" + pizza.cost());

        Pizza pizza2 = SimplePizzaFactory.createPizza(PizzaType.PIZZA_2);
        System.out.println(pizza2.getDescription());
        System.out.println("pizza2的价格为" + pizza2.cost());


        SimplePizzaAbstrFactory simplePizzaAbstrFactory = new SimplePizzaAbstrFactory01();
        Pizza pizza3 = simplePizzaAbstrFactory.createPizza(PizzaType.PIZZA_3);
        System.out.println(pizza3.getDescription());
        System.out.println("pizza3的价格为" + pizza3.cost());
    }
}

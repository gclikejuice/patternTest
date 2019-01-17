package factory.pizzaFactory;

import factory.enums.PizzaType;
import factory.pizza.Pizza;
import factory.pizza.Pizza01;
import factory.pizza.Pizza02;

public class SimplePizzaFactory {

    static Pizza pizza;

    public static Pizza createPizza(Enum type){
        if(PizzaType.PIZZA_1.equals(type)){
            pizza = new Pizza01();
        }
        else if(PizzaType.PIZZA_2.equals(type)){
            pizza = new Pizza02();
        }
        return pizza;
    }
}

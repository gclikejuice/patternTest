package factory.pizzaFactory;

import factory.enums.PizzaType;
import factory.pizza.*;

// 一号披萨抽象工厂
public class SimplePizzaAbstrFactory01 implements SimplePizzaAbstrFactory {

    Pizza pizza;

    public Pizza createPizza(Enum<PizzaType> typeEnum) {
        if(PizzaType.PIZZA_1.equals(typeEnum)){
            pizza = new Pizza01();
        }
        else if(PizzaType.PIZZA_2.equals(typeEnum)){
            pizza = new Pizza02();
        }
        else if(PizzaType.PIZZA_3.equals(typeEnum)){
            pizza = new Pizza03();
        }
        return pizza;
    }
}

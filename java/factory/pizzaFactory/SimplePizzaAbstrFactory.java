package factory.pizzaFactory;

import factory.enums.PizzaType;
import factory.pizza.Pizza;

public interface SimplePizzaAbstrFactory {
    Pizza createPizza(Enum<PizzaType> typeEnum);
}

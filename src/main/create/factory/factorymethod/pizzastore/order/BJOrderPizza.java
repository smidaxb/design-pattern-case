package main.create.factory.factorymethod.pizzastore.order;

import main.create.factory.factorymethod.pizzastore.pizza.BJCheesePizza;
import main.create.factory.factorymethod.pizzastore.pizza.BJPepperPizza;
import main.create.factory.factorymethod.pizzastore.pizza.Pizza;


public class BJOrderPizza extends OrderPizza {


    @Override
    Pizza createPizza(String orderType) {

        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new BJCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new BJPepperPizza();
        }
        return pizza;
    }

}

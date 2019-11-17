package main.create.factory.abstractFactory.pizzastore.order;


import main.create.factory.abstractFactory.pizzastore.pizza.LDCheesePizza;
import main.create.factory.abstractFactory.pizzastore.pizza.LDPepperPizza;
import main.create.factory.abstractFactory.pizzastore.pizza.Pizza;

public class LDFactory implements AbsFactory {

	@Override
	public Pizza createPizza(String orderType) {
		System.out.println("使用抽象工厂模式");
		Pizza pizza = null;
		if (orderType.equals("cheese")) {
			pizza = new LDCheesePizza();
		} else if (orderType.equals("pepper")) {
			pizza = new LDPepperPizza();
		}
		return pizza;
	}

}

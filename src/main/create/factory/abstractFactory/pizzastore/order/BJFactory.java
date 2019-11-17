package main.create.factory.abstractFactory.pizzastore.order;


import main.create.factory.abstractFactory.pizzastore.pizza.BJCheesePizza;
import main.create.factory.abstractFactory.pizzastore.pizza.BJPepperPizza;
import main.create.factory.abstractFactory.pizzastore.pizza.Pizza;

//北京pizza工程实现类
public class BJFactory implements AbsFactory {

	@Override
	public Pizza createPizza(String orderType) {
		System.out.println("使用抽象工厂模式");
		Pizza pizza = null;
		if(orderType.equals("cheese")) {
			pizza = new BJCheesePizza();
		} else if (orderType.equals("pepper")){
			pizza = new BJPepperPizza();
		}
		return pizza;
	}

}

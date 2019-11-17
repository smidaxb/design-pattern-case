package main.create.factory.abstractFactory.pizzastore.order;


import main.create.factory.abstractFactory.pizzastore.pizza.Pizza;

//抽象pizza工厂类
public interface AbsFactory {
	//创建
	public Pizza createPizza(String orderType);
}

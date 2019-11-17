package main.create.factory.abstractFactory.pizzastore.pizza;

public class BJCheesePizza extends Pizza {

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		setName("北京芝士pizza");
		System.out.println(" 准备北京芝士pizza原料");
	}

}

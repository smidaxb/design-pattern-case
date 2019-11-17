package main.create.factory.abstractFactory.pizzastore.pizza;

public class BJPepperPizza extends Pizza {
	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		setName("北京胡椒pizza");
		System.out.println("准备北京胡椒pizza原材料");
	}
}

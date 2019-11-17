package main.create.factory.abstractFactory.pizzastore.pizza;

public class LDPepperPizza extends Pizza{
	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		setName("伦敦胡椒pizza");
		System.out.println("准备伦敦胡椒pizza原材料");
	}
}

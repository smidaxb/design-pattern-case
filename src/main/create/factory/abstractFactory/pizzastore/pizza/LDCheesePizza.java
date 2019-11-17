package main.create.factory.abstractFactory.pizzastore.pizza;

public class LDCheesePizza extends Pizza{

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		setName("伦敦芝士pizza");
		System.out.println("准备伦敦芝士pizza原材料");
	}
}

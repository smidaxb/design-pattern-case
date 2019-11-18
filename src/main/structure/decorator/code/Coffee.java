package main.structure.decorator.code;

/**
 * CREATED BY yangyifan
 * Date: 2019/11/19
 */
public class Coffee extends Drink{

    @Override
    public double cost() {
        return super.getPrice();
    }
}

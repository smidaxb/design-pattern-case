package main.structure.decorator.code;

/**
 * 装饰类
 * CREATED BY smida
 * Date: 2019/11/19
 */
public class Decorator extends Drink {
    private Drink drink;

    @Override
    public double cost() {
        return getPrice() + drink.cost();
    }

    public Drink getDrink() {
        return drink;
    }

    public void setDrink(Drink drink) {
        this.drink = drink;
    }

    @Override
    public String getDes() {
        //getDes()输出被装饰者的信息
        return super.getDes()+super.getPrice()+"&&"+drink.getDes();
    }
}

package main.structure.decorator.code;

/**
 * 具体装饰类
 * CREATED BY yangyifan
 * Date: 2019/11/19
 */
public class DecoratorB extends Decorator {
    public DecoratorB(Drink drink){
        setDrink(drink);
        setDes("调料B");
        setPrice(2.8);
    }
}

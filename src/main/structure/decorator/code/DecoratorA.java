package main.structure.decorator.code;

/**
 * 具体装饰类
 * CREATED BY yangyifan
 * Date: 2019/11/19
 */
public class DecoratorA extends Decorator {
    public DecoratorA(Drink drink){
        setDrink(drink);
        setDes("调料A");
        setPrice(2.3);
    }
}

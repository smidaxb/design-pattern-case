package main.create.factory.SimpleFactory.pizzaStore.order;

import main.create.factory.SimpleFactory.pizzaStore.pizza.CheesPizza;
import main.create.factory.SimpleFactory.pizzaStore.pizza.GreekPizza;
import main.create.factory.SimpleFactory.pizzaStore.pizza.PepperPizza;
import main.create.factory.SimpleFactory.pizzaStore.pizza.Pizza;

/**
 * CREATED BY yangyifan
 * Date: 2019/11/6
 */
//简单工厂类
public class SimpleFactory {

    //更加orderType 返回对应的Pizza 对象
    public Pizza createPizza(String orderType) {

        Pizza pizza = null;

        System.out.println("使用简单工厂模式");
        if (orderType.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setName(" 希腊披萨 ");
        } else if (orderType.equals("chees")) {
            pizza = new CheesPizza();
            pizza.setName(" 奶酪披萨 ");
        } else if (orderType.equals("pepper")) {
            pizza = new PepperPizza();
            pizza.setName("胡椒披萨");
        }

        return pizza;
    }

    //简单工厂模式 也叫 静态工厂模式

    public static Pizza createPizza2(String orderType) {

        Pizza pizza = null;

        System.out.println("使用简单工厂模式2");
        if (orderType.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setName(" 希腊披萨 ");
        } else if (orderType.equals("chees")) {
            pizza = new CheesPizza();
            pizza.setName(" 奶酪披萨 ");
        } else if (orderType.equals("pepper")) {
            pizza = new PepperPizza();
            pizza.setName("胡椒披萨");
        }

        return pizza;
    }

}

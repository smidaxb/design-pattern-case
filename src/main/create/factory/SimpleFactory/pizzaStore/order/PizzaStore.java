package main.create.factory.SimpleFactory.pizzaStore.order;

/**
 * CREATED BY yangyifan
 * Date: 2019/11/6
 */
public class PizzaStore {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
//        new OrderPizza();

        //使用简单工厂模式
//        new OrderPizza(new SimpleFactory());
        //System.out.println("~~退出程序~~");

        OrderPizza2 orderPizza2 = new OrderPizza2();
        orderPizza2.OrderPizza();
    }

}


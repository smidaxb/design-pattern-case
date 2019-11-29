package main.create.factory.SimpleFactory.pizzaStore.order;

import main.create.factory.SimpleFactory.pizzaStore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * CREATED BY smida
 * Date: 2019/11/6
 */
public class OrderPizza2 {
    public void OrderPizza(){
        String type;
        do {
            type = getType();
            Pizza pizza = SimpleFactory.createPizza2(type);

            //输出pizza
            if (pizza != null) { //订购成功
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println(" 订购披萨失败 ");
                break;
            }
        }while (true);
    }
    // 写一个方法，可以获取客户希望订购的披萨种类
    private String getType() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza 种类:");
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}

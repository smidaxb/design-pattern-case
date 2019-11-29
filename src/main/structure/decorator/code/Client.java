package main.structure.decorator.code;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * 点一杯咖啡A+两个A调料+一个B调料
 * CREATED BY smida
 * Date: 2019/11/19
 */
public class Client {
    public static void main(String[] args) throws FileNotFoundException {
        Drink coffeeA_A = new DecoratorA(new CoffeeA());
        Drink coffeeA_AA = new DecoratorA(coffeeA_A);
        Drink coffeeA_AAB = new DecoratorB(coffeeA_AA);
        System.out.println("价格"+"\n"+coffeeA_A.cost()+"\n"+coffeeA_AA.cost()+"\n"+coffeeA_AAB.cost());

        DataInputStream dis = new DataInputStream(new FileInputStream("D:\\adb.txt"));
    }
}

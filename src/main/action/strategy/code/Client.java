package main.action.strategy.code;

/**
 * CREATED BY yangyifan
 * Date: 2019/11/29
 */
public class Client {
    public static void main(String[] args) {
        Duck wild = new WildDuck(new FlyGoodBehavior());
        Duck beijing = new BeiJingDuck(new FlyBadBehavior());
        Duck toy = new ToyDuck(new FlyNoBehavior());

        wild.fly();
        beijing.fly();
        toy.fly();
    }
}

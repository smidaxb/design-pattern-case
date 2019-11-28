package main.action.strategy.code;

/**
 * 玩具鸭
 * CREATED BY yangyifan
 * Date: 2019/11/29
 */
public class ToyDuck extends Duck{
    private FlyBehavior flyBehavior;

    ToyDuck(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
    @Override
    void fly() {
        flyBehavior.fly();
    }
}

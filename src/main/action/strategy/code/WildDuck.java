package main.action.strategy.code;

/**
 * 野鸭
 * CREATED BY yangyifan
 * Date: 2019/11/29
 */
public class WildDuck extends Duck{
    private FlyBehavior flyBehavior;

    WildDuck(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
    @Override
    void fly() {
        flyBehavior.fly();
    }
}

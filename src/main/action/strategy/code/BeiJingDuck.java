package main.action.strategy.code;

/**
 * 北京鸭
 * CREATED BY yangyifan
 * Date: 2019/11/29
 */
public class BeiJingDuck extends Duck{
    private FlyBehavior flyBehavior;

    BeiJingDuck(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
    @Override
    void fly() {
        flyBehavior.fly();
    }
}

package main.action.strategy.code;

/**
 * CREATED BY yangyifan
 * Date: 2019/11/29
 */
public class FlyBadBehavior implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("飞的不太好");
    }
}

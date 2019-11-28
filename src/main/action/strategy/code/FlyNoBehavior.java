package main.action.strategy.code;

/**
 * CREATED BY yangyifan
 * Date: 2019/11/29
 */
public class FlyNoBehavior implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("不能飞");
    }
}

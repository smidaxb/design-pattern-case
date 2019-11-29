package main.action.template.improve;

/**
 * 模板模式
 * CREATED BY smida
 * Date: 2019/11/24
 */
public class Client {
    public static void main(String[] args) {
        //制作红豆豆浆
        SoyaMilk red = new RedBeanSoyaMilk();
        red.make();
        //制作花生豆浆
        SoyaMilk peanut = new PeanutSoyaMilk();
        peanut.make();
        //制作纯豆浆
        SoyaMilk pure = new PureSoyaMilk();
        pure.make();
    }
}

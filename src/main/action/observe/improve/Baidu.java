package main.action.observe.improve;

/**
 * CREATED BY yangyifan
 * Date: 2019/11/26
 */
public class Baidu implements Observer{
    private String name;
    private float t;
    private float p;
    private float h;

    Baidu(String name) {
        this.name = name;
    }
    @Override
    public void update(float t, float p, float h) {
        this.t = t;
        this.p = p;
        this.h = h;
        display();
    }

    private void display() {
        System.out.println(name+"temperature=" + t);
        System.out.println(name+"pressure=" + p);
        System.out.println(name+"humidity=" + h);
    }

}

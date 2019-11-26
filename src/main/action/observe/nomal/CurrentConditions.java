package main.action.observe.nomal;

/**
 * CREATED BY yangyifan
 * Date: 2019/11/26
 */
public class CurrentConditions {
    private float t;
    private float p;
    private float h;

    public void update(float t, float p, float h) {
        this.t = t;
        this.p = p;
        this.h = h;
        display();
    }

    private void display() {
        System.out.println("temperature=" + t);
        System.out.println("pressure=" + p);
        System.out.println("humidity=" + h);
    }

}

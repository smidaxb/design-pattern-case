package main.create.singleton;

/**
 * CREATED BY yangyifan
 * Date: 2019/10/24
 */
public class HungerSingleton {
    private static HungerSingleton singleton;
    static {
        singleton = new HungerSingleton();
    }
    public static HungerSingleton getInstance() throws InterruptedException {
        Thread.sleep(1000);
        return singleton;
    }

    private HungerSingleton() {
    }
}

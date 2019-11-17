package main.create.singleton;

/**
 * CREATED BY yangyifan
 * Date: 2019/10/24
 */
public class LazySingleton {
    private static volatile LazySingleton singleton;

    /**
     * 每次调用都需要执行同步方法，效率低，不推荐使用
     */
    public static synchronized LazySingleton getInstance1() throws InterruptedException {
        if (null == singleton) {
            Thread.sleep(1000);
            singleton = new LazySingleton();
        }
        return singleton;
    }

    /**
     * 使用代码块双重检查，只有在第一次创建的时候使用一次同步代码块，推荐使用
     */
    public static LazySingleton getInstance2() throws InterruptedException {
        if (null == singleton) {
            synchronized (LazySingleton.class) {
                //必须用volatile关键字修饰，否则此处第二个if判断可能会误判
                if (null == singleton) {
                    singleton = new LazySingleton();
                }
            }
        }
        return singleton;
    }
}

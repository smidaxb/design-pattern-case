package main.create.singleton;

/**
 * 静态内部类实现，静态内部类在调用时才会加载，可以懒加载，且不会有线程同步问题
 * CREATED BY smida
 * Date: 2019/11/3
 */
public class InnerClassSingleton {
    private InnerClassSingleton() {
    }

    private static class InnerClassSingletonInstance {
        private final static InnerClassSingleton instance = new InnerClassSingleton();
    }

    public static InnerClassSingleton getInstance() {
        return InnerClassSingletonInstance.instance;
    }
}

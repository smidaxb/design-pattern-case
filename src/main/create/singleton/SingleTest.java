package main.create.singleton;

/**
 * CREATED BY yangyifan
 * Date: 2019/10/24
 */
public class SingleTest {
    public static void main(String[] args) {
        Thread[] threads = new Thread[10];
        for (int i = 0; i < 10; i++) {
// 饿汉式
//           threads[i] = new HungerTread();
// 懒汉式，同步方法
//     threads[i] = new LazyThread1();
            //懒汉式，double check
//            threads[i] = new LazyThread2();
            //静态内部类实现
//            threads[i] = new InnerClassThread();
            //枚举类实现
            threads[i] = new EnumClassThread();
            threads[i].start();
        }
        //源码跟踪
        Runtime runtime = Runtime.getRuntime();
        Runtime runtime1 = Runtime.getRuntime();
        System.out.println(runtime == runtime1);
    }
}

class HungerTread extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("Hunger:" + this.getName() + "instance id" + HungerSingleton.getInstance().hashCode());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class LazyThread1 extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("Lazy1:" + this.getName() + "instance id" + LazySingleton.getInstance1().hashCode());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class LazyThread2 extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("Lazy2:" + this.getName() + "instance id" + LazySingleton.getInstance2().hashCode());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class InnerClassThread extends Thread {
    @Override
    public void run() {
        System.out.println("InnerClassSingleton:" + this.getName() + "instance id" + InnerClassSingleton.getInstance().hashCode());
    }
}

class EnumClassThread extends Thread {
    @Override
    public void run() {
        System.out.println("EnumClassSingleton" + this.getName() + "instance id" + EnumSingleton.INSTANCE + EnumSingleton.INSTANCE.printFiledStr());
    }
}
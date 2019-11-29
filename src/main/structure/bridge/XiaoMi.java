package main.structure.bridge;

/**
 * CREATED BY smida
 * Date: 2019/11/17
 */
public class XiaoMi implements Brand {
    @Override
    public void open() {
        System.out.println("小米开机");
    }

    @Override
    public void call() {
        System.out.println("小米打电话");
    }

    @Override
    public void close() {
        System.out.println("小米关机");
    }
}

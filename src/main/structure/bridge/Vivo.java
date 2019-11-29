package main.structure.bridge;

/**
 * CREATED BY smida
 * Date: 2019/11/17
 */
public class Vivo implements Brand {
    @Override
    public void open() {
        System.out.println("vivo开机");
    }

    @Override
    public void call() {
        System.out.println("vivo打电话");
    }

    @Override
    public void close() {
        System.out.println("vivo关机");
    }
}

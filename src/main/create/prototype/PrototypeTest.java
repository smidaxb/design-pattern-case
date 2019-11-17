package main.create.prototype;

/**
 * CREATED BY yangyifan
 * Date: 2019/10/24
 */
public class PrototypeTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        PrototypeClass a = new PrototypeClass();
        PrototypeClass b = (PrototypeClass) a.clone();
        System.out.println("a:" + a + "\n" + "b:" + b);
    }
}

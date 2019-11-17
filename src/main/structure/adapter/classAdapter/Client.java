package main.structure.adapter.classAdapter;

/**
 * CREATED BY yangyifan
 * Date: 2019/11/17
 */
public class Client {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter());
    }
}

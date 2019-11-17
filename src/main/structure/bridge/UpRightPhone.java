package main.structure.bridge;

/**
 * CREATED BY yangyifan
 * Date: 2019/11/17
 */
public class UpRightPhone extends Phone {
    @Override
    public void open(){
        super.open();
        System.out.println("直立式手机");
    }
    @Override
    public void call(){
        super.call();
        System.out.println("直立式手机");
    }
    @Override
    public void close(){
        super.close();
        System.out.println("直立式手机");
    }
}

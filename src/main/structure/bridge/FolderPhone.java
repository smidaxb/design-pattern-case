package main.structure.bridge;

/**
 * 折叠手机具体类
 * CREATED BY yangyifan
 * Date: 2019/11/17
 */
public class FolderPhone extends Phone {
    @Override
    public void open(){
        super.open();
        System.out.println("折叠式手机");
    }
    @Override
    public void call(){
        super.call();
        System.out.println("折叠式手机");
    }
    @Override
    public void close(){
        super.close();
        System.out.println("折叠式手机");
    }
}

package main.structure.facade.code;

/**
 * CREATED BY smida
 * Date: 2019/11/21
 */
public class TV {
    private static volatile TV instance;
    private TV() {

    }
    public static TV getInstance(){
        if (null == instance){
            synchronized (TV.class){
                if (null == instance){
                    instance = new TV();
                }
            }
        }
        return instance;
    }
    public void on(){
        System.out.println("tv on");
    }
    public void off(){
        System.out.println("tv off");
    }
}

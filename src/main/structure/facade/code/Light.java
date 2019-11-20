package main.structure.facade.code;

/**
 * 灯光
 * CREATED BY yangyifan
 * Date: 2019/11/21
 */
public class Light {
    private static volatile Light instance;
    private Light() {

    }
    public static Light getInstance(){
        if (null == instance){
            synchronized (Light.class){
                if (null == instance){
                    instance = new Light();
                }
            }
        }
        return instance;
    }
    public void on(){
        System.out.println("light on");
    }
    public void off(){
        System.out.println("light off");
    }
}

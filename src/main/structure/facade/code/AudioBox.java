package main.structure.facade.code;

/**
 * 音响
 * CREATED BY smida
 * Date: 2019/11/21
 */
public class AudioBox {
    private static volatile AudioBox instance;
    private AudioBox() {

    }
    public static AudioBox getInstance(){
        if (null == instance){
            synchronized (AudioBox.class){
                if (null == instance){
                    instance = new AudioBox();
                }
            }
        }
        return instance;
    }
    public void on(){
        System.out.println("audio box run");
    }
    public void off(){
        System.out.println("audio box off");
    }
}

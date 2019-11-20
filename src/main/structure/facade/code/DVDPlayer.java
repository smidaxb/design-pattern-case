package main.structure.facade.code;

/**
 * CREATED BY yangyifan
 * Date: 2019/11/21
 */
public class DVDPlayer {
    private static volatile DVDPlayer instance;
    private DVDPlayer() {

    }
    public static DVDPlayer getInstance(){
        if (null == instance){
            synchronized (DVDPlayer.class){
                if (null == instance){
                    instance = new DVDPlayer();
                }
            }
        }
        return instance;
    }
    public void on(){
        System.out.println("dvd run");
    }
    public void off(){
        System.out.println("dvd off");
    }
    public void play(){
        System.out.println("dvd play");
    }
    public void pause(){
        System.out.println("dvd pause");
    }
}

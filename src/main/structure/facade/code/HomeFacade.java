package main.structure.facade.code;

/**
 * CREATED BY yangyifan
 * Date: 2019/11/21
 */
public class HomeFacade {
    private DVDPlayer dvdPlayer;
    private AudioBox audioBox;
    private TV tv;
    private Light light;

    public HomeFacade(){
        this.dvdPlayer = DVDPlayer.getInstance();
        this.audioBox = AudioBox.getInstance();
        this.tv = TV.getInstance();
        this.light = Light.getInstance();
    }

    public void turnOn(){
        System.out.println("++++++++++++++++++   turnOn   +++++++++++++++++++++");
        dvdPlayer.on();
        tv.on();
        audioBox.on();
        light.on();
    }
    public void play(){
        System.out.println("++++++++++++++++++   play   +++++++++++++++++++++");
        dvdPlayer.play();
    }
    public void pause(){
        System.out.println("++++++++++++++++++   pause   +++++++++++++++++++++");
        dvdPlayer.pause();
    }
    public void turnOff(){
        System.out.println("++++++++++++++++++   off   +++++++++++++++++++++");
        dvdPlayer.off();
        tv.off();
        audioBox.off();
        light.off();
    }
}

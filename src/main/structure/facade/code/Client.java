package main.structure.facade.code;

/**
 * CREATED BY yangyifan
 * Date: 2019/11/21
 */
public class Client {
    public static void main(String[] args) {
        HomeFacade homeFacade = new HomeFacade();
        homeFacade.turnOn();
        homeFacade.play();
        homeFacade.pause();
        homeFacade.turnOff();
    }
}

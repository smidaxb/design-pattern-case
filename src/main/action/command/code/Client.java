package main.action.command.code;

/**
 * CREATED BY yangyifan
 * Date: 2019/11/25
 */
public class Client {
    public static void main(String[] args) {
        //使用命令设计模式，完成电灯操作
        //创建电灯接受者
        LightReceiver lightReceiver = new LightReceiver();
        //创建电灯开关命令
        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
        LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);
        //创建遥控器
        RemoteController remoteController = new RemoteController();
        //给遥控器设置，no=0时为电灯操作
        remoteController.setCommand(0,lightOnCommand,lightOffCommand);

        System.out.println("=================按下开灯按钮=================");
        remoteController.onButtonWasPushed(0);
        System.out.println("=================按下关灯按钮=================");
        remoteController.offButtonWasPushed(0);
        System.out.println("=================按下撤销按钮=================");
        remoteController.undoButtonWasPushed();

    }

}

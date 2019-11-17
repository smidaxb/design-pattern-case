package main.structure.adapter.classAdapter;

/**
 * CREATED BY yangyifan
 * Date: 2019/11/17
 */
public class Phone {
    public void charging(Voltage5V voltage5V){
        if (voltage5V.output5()==5){
            System.out.println("5v开始充电");
        }else {
            System.out.println("不为5v无法充电");
        }
    }
}

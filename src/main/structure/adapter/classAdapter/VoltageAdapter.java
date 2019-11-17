package main.structure.adapter.classAdapter;

/**
 * CREATED BY yangyifan
 * Date: 2019/11/17
 */
public class VoltageAdapter extends Voltage220V implements Voltage5V{
    @Override
    public int output5() {
        int src = output220();
        System.out.println("转换为5v");
        int dis = src/44;
        System.out.println("输出5v电压");
        return dis;
    }
}

package main.structure.adapter.objectAdapter;

/**
 * CREATED BY yangyifan
 * Date: 2019/11/17
 */
public class VoltageAdapter implements Voltage5V {
    private Voltage220V voltage220V;

    public VoltageAdapter(Voltage220V voltage220V){
        this.voltage220V = voltage220V;
    }
    @Override
    public int output5() {
        int src = voltage220V.output220();
        System.out.println("转换为5v");
        int dis = src/44;
        System.out.println("输出5v电压");
        return dis;
    }
}

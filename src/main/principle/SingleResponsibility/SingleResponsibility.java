package main.principle.SingleResponsibility;

/**
 * 单一职责原则--每个类只完成一种职责
 * CREATED BY smida
 * Date: 2019/10/28
 */
public class SingleResponsibility {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("摩托车");
        vehicle.run("汽车");
        vehicle.run("轮船");
    }
}
//违反单一职责原则
class Vehicle{
    public void run(String vehicle){
        System.out.println(vehicle+"在路上行驶...");
    }
}

package main.structure.composite.code;

import java.util.HashMap;

/**
 * CREATED BY yangyifan
 * Date: 2019/11/20
 */
public class Client {
    public static void main(String[] args) {
        Component university = new University("清华大学","中国顶级大学");
        College math = new College("数理学院", "math");
        College software = new College("软件学院","soft");
        Department appliedMath = new Department("应用数学系", "");
        Department physical = new Department("物理系", "");
        Department softEngine = new Department("软件工程", "");
        Department netSecurity = new Department("网络安全", "");
        university.add(math);
        university.add(software);
        math.add(appliedMath);
        math.add(physical);
        software.add(softEngine);
        software.add(netSecurity);
        university.print();

        //源码
        HashMap hashMap = new HashMap();
    }
}

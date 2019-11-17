package main.structure.bridge;

import java.sql.Driver;

/**
 * CREATED BY yangyifan
 * Date: 2019/11/17
 */
public class Client {
    public static void main(String[] args) {
        Phone phone1 = new FolderPhone();
        phone1.setBrand(new XiaoMi());
        phone1.open();
        phone1.call();
        phone1.close();
        Phone phone2 = new FolderPhone();
        phone2.setBrand(new Vivo());
        phone2.open();
        phone2.call();
        phone2.close();
        Phone phone3 = new UpRightPhone();
        phone3.setBrand(new XiaoMi());
        phone3.open();
        phone3.call();
        phone3.close();
        //源码分析
        Driver driver;
    }
}

package main.structure.bridge;

/**
 * 手机抽象类
 * CREATED BY smida
 * Date: 2019/11/17
 */
public abstract class Phone {
    private Brand brand;

    public void setBrand(Brand brand) {
        this.brand = brand;
    }
    protected void open(){brand.open();}
    protected void call(){brand.call();}
    protected void close(){brand.close();}
}

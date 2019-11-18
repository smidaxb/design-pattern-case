package main.structure.decorator.code;

/**
 * 主体基类
 * CREATED BY yangyifan
 * Date: 2019/11/19
 */
public abstract class Drink {
    public String des;
    private Double price;

    public abstract double cost();

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}

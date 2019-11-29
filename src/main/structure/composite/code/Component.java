package main.structure.composite.code;

/**
 * CREATED BY smida
 * Date: 2019/11/20
 */
public abstract class Component {
    private String name;
    private String des;
    protected void add(Component component){
        throw new UnsupportedOperationException();
    }

    public String getName() {
        return name;
    }

    public Component(String name, String des) {
        this.name = name;
        this.des = des;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    protected void remove(Component component){
        throw new UnsupportedOperationException();
    }

    protected abstract void print();
}

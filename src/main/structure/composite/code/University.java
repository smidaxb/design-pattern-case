package main.structure.composite.code;

import java.util.ArrayList;
import java.util.List;

/**
 * CREATED BY yangyifan
 * Date: 2019/11/20
 */
public class University extends Component {
    private List<Component> componentList = new ArrayList<>();

    public University(String name, String des) {
        super(name, des);
    }

    @Override
    protected void add(Component component) {
        componentList.add(component);
    }

    @Override
    protected void remove(Component component) {
        componentList.remove(component);
    }

    @Override
    protected void print() {
        System.out.println("=================="+getName()+"=====================");
        for (Component e:componentList){
            e.print();
        }
    }
}

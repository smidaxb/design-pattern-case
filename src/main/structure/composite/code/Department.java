package main.structure.composite.code;

/**
 * CREATED BY yangyifan
 * Date: 2019/11/20
 */
public class Department extends Component {
    public Department(String name, String des) {
        super(name, des);
    }

    @Override
    protected void print() {
        System.out.println(getName());
    }
}

package main.action.iterator.code;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * CREATED BY yangyifan
 * Date: 2019/11/25
 */
public class InfoCollege implements College {
    private List<Department> departments;

    InfoCollege() {
        departments = new ArrayList<>();
        addDepart("info security", "info security");
        addDepart("net security", "ns");
        addDepart("password security", "ps");
    }

    @Override
    public void addDepart(String name, String desc) {
        departments.add(new Department(name, desc));
    }

    @Override
    public String getName() {
        return "信息学院";
    }

    @Override
    public Iterator createIterator() {
        return new InfoCollegeIterator(departments);
    }

}

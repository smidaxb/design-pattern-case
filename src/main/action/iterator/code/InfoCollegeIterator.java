package main.action.iterator.code;

import java.util.Iterator;
import java.util.List;

/**
 * CREATED BY yangyifan
 * Date: 2019/11/25
 */
public class InfoCollegeIterator implements Iterator {
    //需知道Department的存放方式
    List<Department> departments;
    int position = -1;

    public InfoCollegeIterator(List<Department> departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        if (position >= departments.size()-1) {
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        position++;
        Department department = departments.get(position);
        return department;
    }
}

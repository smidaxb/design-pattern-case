package main.action.iterator.code;

import java.util.Iterator;

/**
 * CREATED BY yangyifan
 * Date: 2019/11/25
 */
public class ComputerCollegeIterator implements Iterator {
    //需知道Department的存放方式
    Department[] departments;
    int position = 0;

    public ComputerCollegeIterator(Department[] departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        if (position >= departments.length || null == departments[position]) {
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        Department department = departments[position];
        position++;
        return department;
    }
}

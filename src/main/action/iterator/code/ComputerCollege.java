package main.action.iterator.code;

import java.util.Iterator;

/**
 * CREATED BY yangyifan
 * Date: 2019/11/25
 */
public class ComputerCollege implements College {
    private Department[] departments;
    int numOfDepartment = 0;//保存当前数组对象个数
    ComputerCollege(){
        departments = new Department[10];
        addDepart("java","java");
        addDepart("php","php");
        addDepart("js","js");
    }
    @Override
    public void addDepart(String name, String desc) {
        Department department = new Department(name, desc);
        departments[numOfDepartment] = department;
        numOfDepartment++;
    }

    @Override
    public String getName() {
        return "计算机学院";
    }

    @Override
    public Iterator createIterator() {
        return new ComputerCollegeIterator(departments);
    }
}

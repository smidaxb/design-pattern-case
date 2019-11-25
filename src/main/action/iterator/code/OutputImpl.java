package main.action.iterator.code;

import java.util.Iterator;
import java.util.List;

/**
 * CREATED BY yangyifan
 * Date: 2019/11/25
 */
public class OutputImpl {
    //学院集合
    List<College> collegeList;

    OutputImpl(List<College> colleges) {
        this.collegeList = colleges;
    }

    //遍历学院
    public void printCollege() {
        for (College college : collegeList) {
            System.out.println("++++++++++++++++++++" + college.getName() + "+++++++++++++++++++");
            printDepartment(college.createIterator());
        }
    }

    //输出学院 输出系
    private void printDepartment(Iterator iterator) {
        while (iterator.hasNext()) {
            Department d = (Department) iterator.next();
            System.out.println(d.getName());
        }
    }
}

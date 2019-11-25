package main.action.iterator.code;

import java.util.ArrayList;
import java.util.List;

/**
 * CREATED BY yangyifan
 * Date: 2019/11/26
 */
public class Client {
    public static void main(String[] args) {
        List<College> collegeList = new ArrayList<College>();
        collegeList.add(new InfoCollege());
        collegeList.add(new ComputerCollege());

        OutputImpl output = new OutputImpl(collegeList);
        output.printCollege();

        //jdk
        ArrayList arrayList;
    }
}

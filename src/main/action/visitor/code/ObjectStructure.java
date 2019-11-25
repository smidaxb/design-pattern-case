package main.action.visitor.code;

import java.util.LinkedList;
import java.util.List;

/**
 * CREATED BY yangyifan
 * Date: 2019/11/25
 */
public class ObjectStructure {
    private List<Person> personList = new LinkedList<>();

    //添加到list
    public void attach(Person p){
        personList.add(p);
    }
    //移除
    public void detach(Person p) {
        personList.remove(p);
    }

    public void display(Action action) {
        for (Person p : personList) {
            p.accept(action);
        }
    }
}

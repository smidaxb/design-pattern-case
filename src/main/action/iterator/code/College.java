package main.action.iterator.code;

import java.util.Iterator;

/**
 * CREATED BY yangyifan
 * Date: 2019/11/25
 */
public interface College {
    public void addDepart(String name, String desc);

    String getName();

    Iterator createIterator();
}

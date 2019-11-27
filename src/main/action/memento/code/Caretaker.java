package main.action.memento.code;

import java.util.ArrayList;
import java.util.List;

/**
 * CREATED BY yangyifan
 * Date: 2019/11/27
 */
public class Caretaker {
    private List<Memento> mementos;

    Caretaker() {
        mementos = new ArrayList<>();
    }

    public void addMemento(Memento memento) {
        mementos.add(memento);
    }

    public Memento getMementoFromIndex(int i) {
        return mementos.get(i);
    }
}

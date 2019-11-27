package main.action.memento.code;

/**
 * CREATED BY yangyifan
 * Date: 2019/11/27
 */
public class Memento {
    private String state;

    Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

}

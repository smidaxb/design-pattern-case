package main.action.visitor.code;

/**
 * CREATED BY yangyifan
 * Date: 2019/11/25
 */
public class Woman extends Person {
    Woman(String name) {
        this.name =name;
    }
    @Override
    void accept(Action action) {
        action.getWomanResult(this);
    }
}

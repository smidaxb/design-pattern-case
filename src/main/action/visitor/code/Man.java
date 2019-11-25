package main.action.visitor.code;

/**
 * CREATED BY yangyifan
 * Date: 2019/11/25
 */
public class Man extends Person {
    Man(String name) {
        this.name =name;
    }
    @Override
    void accept(Action action) {
        action.getManResult(this);
    }
}

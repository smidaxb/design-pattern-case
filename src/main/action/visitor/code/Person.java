package main.action.visitor.code;

/**
 * CREATED BY yangyifan
 * Date: 2019/11/25
 */
public abstract class Person {
    protected String name;
    abstract void accept(Action action);
}

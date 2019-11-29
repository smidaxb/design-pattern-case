package main.action.visitor.code;

/**
 * 操作
 * CREATED BY smida
 * Date: 2019/11/25
 */
public abstract class Action {
    //得到男性测评
    abstract void getManResult(Man man);
    //得到女性测评
    abstract void getWomanResult(Woman woman);
}

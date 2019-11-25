package main.action.visitor.code;

/**
 * CREATED BY yangyifan
 * Date: 2019/11/25
 * 1、使用了双分派，即首先在客户端中，将具体状态作为参数传递给man
 * 2、之后，man调用具体方法getManResult()，同时将自己this作为参数传入，完成第二次分派
 */
public class Success extends Action {

    @Override
    void getManResult(Man man) {
        System.out.println(man.name+"man gives success");
    }

    @Override
    void getWomanResult(Woman woman) {
        System.out.println(woman.name +"woman gives success");
    }
}

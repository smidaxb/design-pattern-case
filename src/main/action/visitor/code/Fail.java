package main.action.visitor.code;

/**
 * CREATED BY yangyifan
 * Date: 2019/11/25
 */
public class Fail extends Action {
    @Override
    void getManResult(Man man) {
        System.out.println(man.name+"man gives fail");
    }

    @Override
    void getWomanResult(Woman woman) {
        System.out.println(woman.name+"woman gives fail");
    }
}

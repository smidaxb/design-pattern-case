package main.action.memento.code;

/**
 * CREATED BY yangyifan
 * Date: 2019/11/27
 */
public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();
        //0
        originator.setState("攻击力100");
        caretaker.addMemento(originator.saveStateToMemento());
        //1
        originator.setState("攻击力80");
        caretaker.addMemento(originator.saveStateToMemento());
        //2
        originator.setState("攻击力50");
        caretaker.addMemento(originator.saveStateToMemento());

        System.out.println("角色当前状态："+originator.getState());
        System.out.println("恢复至状态1");
        originator.getStateFromMemento(caretaker.getMementoFromIndex(1));
        System.out.println("角色当前状态："+originator.getState());
        System.out.println("恢复至状态0");
        originator.getStateFromMemento(caretaker.getMementoFromIndex(0));
        System.out.println("角色当前状态："+originator.getState());
    }
}

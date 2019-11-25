package main.action.visitor.code;

/**
 * CREATED BY yangyifan
 * Date: 2019/11/25
 */
public class Client {
    public static void main(String[] args) {
        ObjectStructure successGroup = new ObjectStructure();

        successGroup.attach(new Man("小强"));
        successGroup.attach(new Woman("小红"));

        //小强小红给成功
        Success success = new Success();
        successGroup.display(success);



    }
}

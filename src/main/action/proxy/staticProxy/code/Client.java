package main.action.proxy.staticProxy.code;

/**
 * CREATED BY yangyifan
 * Date: 2019/11/24
 */
public class Client {
    public static void main(String[] args) {
        //创建被代理对象，并将其传递给代理对象
        ITeacherDao proxy = new TeacherDaoProxy(new TeacherDao());
        proxy.teach();
    }

}

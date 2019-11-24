package main.action.proxy.staticProxy.code;

/**
 * 静态代理对象
 * CREATED BY yangyifan
 * Date: 2019/11/24
 */
public class TeacherDaoProxy implements ITeacherDao{
    private ITeacherDao target;

    TeacherDaoProxy(ITeacherDao teacherDao){
        this.target = teacherDao;
    }
    @Override
    public void teach() {
        System.out.println("代理开始");
        target.teach();
        System.out.println("代理结束");
    }
}

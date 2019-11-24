package main.action.proxy.staticProxy.code;

/**
 * CREATED BY yangyifan
 * Date: 2019/11/24
 */
public class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println("老师在上课");
    }
}

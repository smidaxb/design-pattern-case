package main.action.proxy.dynamicJDKProxy.code;

public class TeacherDao implements ITeacherDao {

	@Override
	public void teach() {
		System.out.println(" 老师上课 ");
	}

	@Override
	public void sayHello(String name) {
		System.out.println("hello " + name);
	}
	
}

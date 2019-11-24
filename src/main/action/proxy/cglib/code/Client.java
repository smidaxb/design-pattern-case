package main.action.proxy.cglib.code;

public class Client {

	public static void main(String[] args) {
		TeacherDao target = new TeacherDao();
		TeacherDao proxyInstance1 = (TeacherDao)new ProxyFactory(target).getProxyInstance();
		TeacherDao proxyInstance2 = (TeacherDao)new ProxyFactory(target).getProxyInstance();

		System.out.println("proxyInstance1=" + proxyInstance1.getClass());
		System.out.println("proxyInstance2=" + proxyInstance2.getClass());

		String res = proxyInstance1.teach();
		System.out.println("res=" + res);
	}

}

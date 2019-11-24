package main.action.proxy.cglib.code;

public class Client {

	public static void main(String[] args) {
		TeacherDao target = new TeacherDao();
		TeacherDao proxyInstance1 = (TeacherDao)new ProxyFactory(target).getProxyInstance();
		TeacherDao proxyInstance2 = (TeacherDao)new ProxyFactory(target).getProxyInstance();

		/**
		 * 在设置用户缓存为true时不会产生内存溢出，设置为false时，是会引发内存溢出的
		 */
		//proxyInstance1=class main.action.proxy.cglib.code.TeacherDao$$EnhancerByCGLIB$$841e5704
		System.out.println("proxyInstance1=" + proxyInstance1.getClass());
		//proxyInstance2=class main.action.proxy.cglib.code.TeacherDao$$EnhancerByCGLIB$$841e5704_2
		System.out.println("proxyInstance2=" + proxyInstance2.getClass());

		String res = proxyInstance1.teach();
		System.out.println("res=" + res);
	}

}

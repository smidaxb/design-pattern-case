package main.action.proxy.dynamicJDKProxy.code;

public class Client {

	public static void main(String[] args) {
		ITeacherDao target = new TeacherDao();
		
		ITeacherDao proxyInstance = (ITeacherDao)new ProxyFactory(target).getProxyInstance();
	
		// proxyInstance=class com.sun.proxy.$Proxy0
		/**
		 * 在此处若直接打印proxyInstance，会执行一次invoke前后的语句
		 */
		System.out.println("proxyInstance=" + proxyInstance.getClass());
//		System.out.println("proxyInstance=" + proxyInstance);

		proxyInstance.teach();

		proxyInstance.sayHello(" tom ");
	}

}

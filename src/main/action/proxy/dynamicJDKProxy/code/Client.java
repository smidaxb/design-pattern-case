package main.action.proxy.dynamicJDKProxy.code;

/**
 * 代理类源码
 * public final class $Proxy0 extends Proxy implements UserManager {
 *     private static Method m1;
 *     private static Method m0;
 *     private static Method m3;
 *     private static Method m2;
 *
 *     static {
 *         try {
 *             m1 = Class.forName("java.lang.Object").getMethod("equals",
 *                     new Class[] { Class.forName("java.lang.Object") });
 *             m0 = Class.forName("java.lang.Object").getMethod("hashCode",
 *                     new Class[0]);
 *             m3 = Class.forName("cn.edu.jlu.proxy.UserManager").getMethod("addUser",
 *                     new Class[0]);
 *             m2 = Class.forName("java.lang.Object").getMethod("toString",
 *                     new Class[0]);
 *         } catch (NoSuchMethodException nosuchmethodexception) {
 *             throw new NoSuchMethodError(nosuchmethodexception.getMessage());
 *         } catch (ClassNotFoundException classnotfoundexception) {
 *             throw new NoClassDefFoundError(classnotfoundexception.getMessage());
 *         }
 *     }
 *
 *     public $Proxy0(InvocationHandler invocationhandler) {
 *         super(invocationhandler);
 *     }
 *
 *     @Override
 *     public final boolean equals(Object obj) {
 *         try {
 *             return ((Boolean) super.h.invoke(this, m1, new Object[] { obj }))
 *                     .booleanValue();
 *         } catch (Throwable throwable) {
 *             throw new UndeclaredThrowableException(throwable);
 *         }
 *     }
 *
 *     @Override
 *     public final int hashCode() {
 *         try {
 *             return ((Integer) super.h.invoke(this, m0, null)).intValue();
 *         } catch (Throwable throwable) {
 *             throw new UndeclaredThrowableException(throwable);
 *         }
 *     }
 *
 *     @Override
 *     public final String toString() {
 *         try {
 *             return (String) super.h.invoke(this, m2, null);
 *         } catch (Throwable throwable) {
 *             throw new UndeclaredThrowableException(throwable);
 *         }
 *     }
 *
 *     @Override
 *     public void addUser() {
 *         try {
 *             super.h.invoke(this, m3, null);
 *             return;
 *         } catch (Error e) {
 *         } catch (Throwable throwable) {
 *             throw new UndeclaredThrowableException(throwable);
 *         }
 *
 *     }
 * }
 */
public class Client {

	public static void main(String[] args) {
		ITeacherDao target = new TeacherDao();
		
		ITeacherDao proxyInstance1 = (ITeacherDao)new ProxyFactory(target).getProxyInstance();
		ITeacherDao proxyInstance2 = (ITeacherDao)new ProxyFactory(target).getProxyInstance();

		// proxyInstance=class com.sun.proxy.$Proxy0
		/**
		 * 在此处若直接打印proxyInstance，会执行一次invoke前后的语句，原因看注释源码的toString()方法
		 */
		System.out.println("proxyInstance1=" + proxyInstance1.getClass());
		System.out.println("proxyInstance2=" + proxyInstance2.getClass());

		proxyInstance1.teach();

		proxyInstance1.sayHello(" tom ");
	}

}

package main.action.proxy.cglib.code;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class ProxyFactory implements MethodInterceptor {

	private Object target;
	
	public ProxyFactory(Object target) {
		this.target = target;
	}

	//返回一个target对象的代理对象
	public Object getProxyInstance() {
		//1. 创建cglib工具类
		Enhancer enhancer = new Enhancer();
		//2. 设置父类
		enhancer.setSuperclass(target.getClass());
		//3. 设置回调函数
		enhancer.setCallback(this);
		//4. 创建子类对象（代理对象）
		return enhancer.create();
		
	}
	

	@Override
	public Object intercept(Object arg0, Method method, Object[] args, MethodProxy arg3) throws Throwable {
		System.out.println("cglib代理开始");
		Object returnVal = method.invoke(target, args);
		System.out.println("cglib代理结束");
		return returnVal;
	}

}

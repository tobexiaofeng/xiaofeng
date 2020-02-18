package practice;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class WorkHandler implements InvocationHandler {
	
	//代理类中的真实对象
	private Object obj;
		
	public WorkHandler() {
		super();
	}
	
	public WorkHandler(Object obj) {
		super();
		this.obj = obj;
	}

	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		//真实的对象执行之前我们可以添加自己的操作
		System.out.println("before invoke...");
		Object invoke = method.invoke(obj, args);
		//在真实的对象执行之后我们可以添加自己的操作
		System.out.println("after invoke...");
		return invoke;
	}

}

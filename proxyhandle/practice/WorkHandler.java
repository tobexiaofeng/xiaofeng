package practice;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class WorkHandler implements InvocationHandler {
	
	//�������е���ʵ����
	private Object obj;
		
	public WorkHandler() {
		super();
	}
	
	public WorkHandler(Object obj) {
		super();
		this.obj = obj;
	}

	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		//��ʵ�Ķ���ִ��֮ǰ���ǿ�������Լ��Ĳ���
		System.out.println("before invoke...");
		Object invoke = method.invoke(obj, args);
		//����ʵ�Ķ���ִ��֮�����ǿ�������Լ��Ĳ���
		System.out.println("after invoke...");
		return invoke;
	}

}

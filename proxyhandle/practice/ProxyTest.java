package practice;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyTest {
	public static void main(String[] args) {
		 //Ҫ�������ʵ����
        People people = new Teacher();
        /**
         * �������ĵ��ô���������ǽ�Ҫ�������ʵ������������ĵ��ô���Ĺ��캯���У�
         * ���մ������ĵ��ô������������ʵ����ķ���
         */
        InvocationHandler handler = new WorkHandler(people);
        /**
         * ͨ��Proxy���newProxyInstance������������������������·����еĲ���
         * ��һ��������people.getClass().getClassLoader()��ʹ��handler�����classloader����������
         * ���ǵĴ������
         * �ڶ���������people.getClass().getInterfaces()������Ϊ�������ṩ�Ľӿ�����ʵ����ʵ�ֵĽӿڣ�
         * ������������������ʵ����һ�����ýӿ��е����з���
         * ������������handler�����ǽ������������������InvocationHandler������
         */
//        People proxy = (People)Proxy.newProxyInstance(handler.getClass().getClassLoader(), 
//        		people.getClass().getInterfaces(), handler);
//        //System.out.println(proxy.toString());
//        System.out.println(proxy.work());
        People proxy = (People)Proxy.newProxyInstance(people.getClass().getClassLoader(), 
        		people.getClass().getInterfaces(), new InvocationHandler() {

					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						
						System.out.println("ִ��Դ����֮ǰ");
						Object invoke = method.invoke(people, args);
						System.out.println("ִ��Դ����֮��");
						
						return invoke;
					}        	
        });
        System.out.println(proxy.work());
	}
}

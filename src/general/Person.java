package general;

/**
 * ����ʵ����
 * @author ����
 * @date 2020��1��19�� ����9:24:41
 * @param <Q>
 * 
 * ��һ��ʵ���������������ʱ�򣬱���Ҫͬʱ����ѧ���͹��ˣ��Ϳ���ʹ�÷�����������
 * ��ס�����Ͷ��������new��ʱ��Ҳ����ȷ������ľ���ʵ����
 */
public class Person<Q> {
	private Q q;
	/**
	 * ���Ͷ����ڷ�����
	 * @param <W>
	 * @param str
	 * 
	 * ����ȷ�����Ķ���Ϊ���ͣ�Ȼ�����������Ϊ�÷���
	 */
	public <W> void show(W str) {
		System.out.println(str);
	}
	
	/**
	 * ��������̬ʱ�����ܷ������϶���ķ��͡������̬����ʹ�÷���
	 * ֻ�ܽ����Ͷ����ڷ�����
	 * @param <Y>
	 * @param obj
	 */
	public static <Y> void method(Y obj) {
		System.out.println("method:" + obj);
	}
}

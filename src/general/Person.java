package general;

/**
 * 泛型实体类
 * @author 华峰
 * @date 2020年1月19日 下午9:24:41
 * @param <Q>
 * 
 * 当一个实体类操作多个对象的时候，比如要同时操作学生和工人，就可以使用泛型来定义类
 * 记住，泛型定义的类在new的时候也有明确你操作的具体实体类
 */
public class Person<Q> {
	private Q q;
	/**
	 * 泛型定义在方法上
	 * @param <W>
	 * @param str
	 * 
	 * 先明确操作的对象为泛型，然后定义操作参数为该泛型
	 */
	public <W> void show(W str) {
		System.out.println(str);
	}
	
	/**
	 * 当方法静态时，不能访问类上定义的泛型。如果静态方法使用泛型
	 * 只能将泛型定义在方法上
	 * @param <Y>
	 * @param obj
	 */
	public static <Y> void method(Y obj) {
		System.out.println("method:" + obj);
	}
}

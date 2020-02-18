package reflect;

public class Animal {
	private String name;
	private int age;
	
	public Animal() {
		super();
	}
	public Animal(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void showName() {
		System.out.println("我的名字叫：" + this.name);
	}
	
	public void showInfo(String name,int age) {
		System.out.println("我其实叫：" + name + ",并且我已经" + age +"岁了");
	}
}

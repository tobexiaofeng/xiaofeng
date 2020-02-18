package general;

/**
 * 
 * @author 华峰
 * @date 2020年1月20日 上午8:35:56
 */
public class Cat extends Animal{

	@Override
	public String toString() {
		return this.getName() + this.getAge() + "岁";
	}

	public Cat(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		return true;
	}

}

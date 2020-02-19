package general;

/**
 * 动物
 * @author 华峰
 * @date 2020年1月20日 上午8:32:00
 */
public class Animal implements Comparable<Animal>{
	private String name;
	private int age;
	
	@Override
	public String toString() {
		return this.getName() + "的寿命是" + this.getAge() + "岁";
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public Animal(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	/**
	 * 实现Comparable接口,实现动物的自然排序
	 * @param a
	 * @return
	 */
	public int compareTo(Animal a) {
		int temp = this.getAge() - a.getAge();
		return temp == 0 ? this.getName().compareTo(a.getName()) : temp;
	}

}

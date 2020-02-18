package general;

/**
 * 
 * @author ����
 * @date 2020��1��20�� ����8:35:56
 */
public class Cat extends Animal{

	@Override
	public String toString() {
		return this.getName() + this.getAge() + "��";
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

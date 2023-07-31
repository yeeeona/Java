package animal;

// Animal 클래스를 상속한 자식 클래스
public class Cat extends Animal{
	private int age;
	
	public Cat(String name, int age) {
		super(name);
		this.age = age;
	}
	
	// getter
	public int getAge() {
		return age;
	}
	
	// setter
	public void setAge(int age) {
		this.age = age;
	}
	
	public void bark() {
		System.out.println("미야옹");
	}
	
	public String toString() {
		return "내 이름은 "  + getName() + "이고, 나이는 " + age + "살입니다. ";
	}
}

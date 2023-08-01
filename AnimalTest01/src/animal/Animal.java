package animal;

/*
 < 추상 메소드(abstract method) >
 - 구체적인 행위를 기술할 수 없을 때 사용하는 메소드
 - 메소드의 실행부분을 생략하고, abstract 키워드를 붙임
 
 < 추상 클래스(abstract class) >
 1. 추상 메소드를 가지고 있으면, 반드시 추상 클래스가 되어야 한다.
 2. 추상 메소드가 없어도 추상 클래스가 될 수 있다.
 3. 추상 클래스는 인스턴스를 생성할 수 없다.
 4. 추상 클래스로부터 상속받은 자식 클래스에서는 추상 메소드를 반드시 오버라이딩해야 한다.
 5. 추상 클래스로부터 상속받은 자식 클래스에서 추상 메소드를 오버라이딩하지 않는다면, 자식 클래스가 추상 클래스가 되어야한다.
 6. 추상 클래스는 부모 클래스로 사용되고. 오직 상속과 다형성의 구현을 위해서 사용하는 목적이다.
 
 
 */
// 추상 클래스 - 부모 클래스
public abstract class Animal {
	private String name;
	
	public Animal(String name) {
		this.name = name;
	}
	
	// 추상 메소드
	public abstract void bark();
	
	public abstract String toString();
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	// 자기 소개 메소드
	public void introduce() {
		System.out.println(toString());
		bark();
	}
}

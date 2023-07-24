// 문제1) 아래의 조건을 부합하는 Member 클래스를 생성하고, 인스턴스를 만들어 사용하시오.
/*
 1. 멤버변수: 이름(name), 회원번호(no), 나이(age)
 2. 생성자: 멤버변수를 초기화
 3. 멤버 메소드: getter, setter, 멤버변수의 정보를 출력 메소드
 4. 인스턴스: 회원을 3명 만들어 출력하시오.
 */

class Member {
	private String name;
	private String no;
	private int age;
	
	public Member() {
		
	}
	
	public Member(String name, String no, int age) {
		this.name = name;
		this.no = no;
		this.age = age;
	}
	// getter
	public String getName() {
		return this.name;
	}
	public String getNo() {
		return this.no;
	}
	public int getAge() {
		return this.age;
	}
	
	// setter
	public void setName(String name) {
		this.name = name;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void showInfo() {
		System.out.println("회원명: " + name + ", 번호: " + no + ", 나이: " + age);
		
	}
	
}
public class MemberTest01 {
	public static void main(String[] args) {
		Member m1 = new Member("정해인", "123456", 25);
		Member m2 = new Member("구교환", "223344", 26);
		Member m3 = new Member("손석구", "456789", 31);
		Member m4 = new Member();
		

		m1.showInfo();
		m2.showInfo();
		m3.showInfo();
		
		// setter
		m4.setName("지진희");
		m4.setNo("778899");
		m4.setAge(45);
		
		// getter
		System.out.println("회원명: " + m4.getName());
		System.out.println("회원번호: " + m4.getNo());
		System.out.println("회원나이: " + m4.getAge());
		
		
		
	}

}

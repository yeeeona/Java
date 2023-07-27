package member;

public class Member {
	private String name;
	private String no;
	private int age;
	
	public Member(String name, String no, int age) {
		this.name = name;
		this.no = no;
		this.age = age;
	}
	
	// getter
	public String getName() {
		return name;
	}
	public String getNo() {
		return no;
	}
	public int getAge() {
		return age;
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
	
	// 출력
	public String toString() {
		return String.format("회원명: %s , 번호: %s , 나이: %d ", name, no, age);
	}
	
	public void showInfo() {
		System.out.println("회원명: " + name);
		System.out.println("회원번호: " + no);
		System.out.println("회원나이: " + age);
	}
	
}

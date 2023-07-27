package member;

public class SpecialMember extends Member{
	
	private String privilege;
	
	public SpecialMember(String name, String no, int age, String privilege) {
		// setName(name) <- 이것도 가능하긴 함
		super(name, no, age);
		this.privilege = privilege;
	}
	
	// getter
	public String getPrivilege() {
		return privilege;
	}
	
	// setter
	public void setPrivilege(String privilege) {
		this.privilege = privilege;
	}
	
	// 출력
	public String toString() {
		return super.toString() + "특별혜택: " + privilege;
	}
	
	public void showInfo() {
		System.out.println("회원명: " + getName());
		System.out.println("회원번호: " + getNo());
		System.out.println("회원나이: " + getAge());
		System.out.println("특별혜택: " + privilege);
	}
	
	
	
	
}

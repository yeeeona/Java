package member;

public class SpeicialMember extends Member {
	private String benefit;
	
	public SpeicialMember(int no, String name, String tel, int age, String benefit) {
		super(no, name, tel, age);
		this.benefit = benefit;
	}
	
	// getter
	public String getBenefit() {
		return benefit;
	}
	// setter
	public void setBenefit(String benefit) {
		this.benefit = benefit;
	}
	
	@Override
	public String toString() {
		return "회원번호: " + getNo() + ", " + "이름: " + getName() + ", " + "전화번호: " + getTel() + ", " + "나이: " + getAge() + ", " + "특별혜택: " + benefit; 
	}
}

package pet;

// 반려 동물 클래스 -> 부모 클래스
public class Pet {
	private String name;
	private String masterName;
	
	public Pet(String name, String masterName) {
		this.name = name;
		this.masterName = masterName;
	}
	
	public String getName() {
		return name;
	}
	public String getMasterName() {
		return masterName;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setMasterName(String masterName) {
		this.masterName = masterName;
	}
	
	// 자기소개 메소드
	public void introduce() {
		System.out.println("* 내 이름은 " + name + "입니다.");
		System.out.println("* 주인님의 이름은 " + masterName + "입니다.");
	}
}

package member;

public class Member implements Comparable<Member>{
	private int no;
	private String name;
	private String tel;
	private int age;
	
	public Member (int no, String name, String tel, int age) {
		this.no = no;
		this.name = name;
		this.tel = tel;
		this.age = age;
	}
	
	// getter
	public int getNo() {
		return no;
	}
	public String getName() {
		return name;
	}
	public String getTel() {
		return tel;
	}
	public int getAge() {
		return age;
	}
	
	// setter
	public void setNo(int no) {
		this.no = no;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "회원번호: " + no + ", " + "이름: " + name + ", " + "전화번호: " + tel + ", " + "나이: " + age;
	}
	
	// 정렬
	@Override
	public int compareTo(Member m) {
		if(this.no > m.no) return 1;
		else if(this.no < m.no) return -1;
		else return 0;
	}
	
}

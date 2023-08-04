import java.util.HashSet;

class Member {
	private String name;
	private int age;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	public void SetName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString() {
		return name + "(" + age + ")";
	}
	
	// Object 틀래스 hashCode(), equals() 메소드 오버라이딩
	// hashCode() 오버라이딩 -> 인스턴스의 해시코드를 새로 생성
	@Override
	public int hashCode() {
		return (name+age).hashCode();
	}
	
	// equals() 오버라이딩 -> 해시코드를 비교하여 같은 인스턴스인지 다른 인스턴스 인지를 판단
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member m = (Member) obj;
			return this.name.equals(m.name) && this.age == m.age;
		}
		
		return false;
	}
}

public class HashSetTest04 {
	public static void main(String[] args) {
		HashSet<Member> set = new HashSet<>();
		
		// 데이터 추가
		set.add(new Member("이익준", 42));
		set.add(new Member("김준완", 41));
		set.add(new Member("채송화", 39));
		set.add(new Member("양석형", 38));
		set.add(new Member("안정원", 40));
		
		System.out.println(set);
		
		// 중복 데이터 추가 - 이름만 중복 - 허용
		set.add(new Member("채송화",25));
		System.out.println(set);
		System.out.println("크기: " + set.size());

		
		// 중복 데이터 추가 - 나이만 중복 - 허용
		set.add(new Member("장겨울", 40));
		System.out.println(set);
		System.out.println("크기: " + set.size());
		
		// 3. 중복 데이터 추가 - 이름과 나이가 모두 중복
		// -> 문제점 발현: 중복 데이터를 허용하지 않아야 함
		// -> 해결책: 해당 클래스에서 Object 클래스 hasCoode(), equals() 메소드를 오버라이딩함
		set.add(new Member("이익준", 42));
		System.out.println(set);
		System.out.println("크기: " + set.size());
	}

}

/*
문제1) 아래의 조건을 만족하는 Id 클래스를 생성하고, 사용하시오.
1. 인스턴스 변수: id
2. 클래스 변수: count
3. 기본 생성자: 일련번호를 1씩 증가
4. 인스턴스 메소드: getter, setter, 출력 메소드(toString)
5. 클래스 메소드: getter
6. 사용: 인스턴스 5개 만들어 확인, 일련번호를 확인
7. 인스턴스 5개를 인스턴스의 배열을 만들어 확인하시오.

 */

class Id {
	
	// 클래스 변수
	private static int count = 0;
	
	// 인스턴스 변수
	private int id;
	
	// 생성자
	public Id() {
		this.id = ++count;
	}
	
	// 클래스 메소드
	public static int getCount() {
		return count;
	}
	
	// 인스턴스 메소드
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	// 출력 메소드
	public String toString() {
		return "No: " + id;
	}
}
public class IdTest01 {
	public static void main(String[] args) {
		Id id1 = new Id();
		Id id2 = new Id();
		Id id3 = new Id();
		Id id4 = new Id();
		Id id5 = new Id();
		
		System.out.println(id1.toString());
		System.out.println(id2);
		System.out.println(id3);
		System.out.println(id4);
		System.out.println(id5);
		
		Id[] ids = new Id[] {
				new Id(),
				new Id(),
				new Id(),
				new Id(),
				new Id(),
		};
		// 1번 기본 for문
		/*
		for(int i=0; i<ids.length; i++) {
			System.out.println(ids[i].toString());
		}
		*/
		
		// 2번 확장 for문
		for(Id id : ids) {
			System.out.println(id.toString());
		}
		
		System.out.println("생성한 일련번호: " + Id.getCount());
		// System.out.println("생성한 일련번호: " + id3.getCount()); // 권장하지않
		
	}
}

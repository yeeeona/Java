/*
문제1) 아래의 조건을 만족하는 Id 클래스를 생성하고, 사용하시오.
1. 인스턴스 변수: id
2. 클래스 변수: count
3. 기본 생성자: 일련번호를 1씩 증가
4. 인스턴스 메소드: getter, setter, 출력 메소드(toString)
5. 클래스 메소드: getter
6. 사용: 인스턴스 5개 만들어 확인, 일련번호를 확인

 */

class Id {
	
	// 클래스 변수
	private static int count = 0;
	
	// 인스턴스 변수
	private int id;
	
	// 생성자
	public Id(int id) {
		this.id = ++count;
	}
	
	// 클래스 메소드
	public static int getCount() {
		return count;
	}
	
	// getter
	public int getId() {
		return this.id;
	}
	
	// setter
	public void setId(int id) {
		this.id = id;
	}
	
	// 출력 메소드
//	public void 
}
public class IdTest01 {
	public static void main(String[] args) {
		Id n1 = new Id(1);
		Id n2 = new Id(2);
		Id n3 = new Id(3);
		Id n4 = new Id(4);
		Id n5 = new Id(5);
		
		
	}

}

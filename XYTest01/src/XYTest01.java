
class XY {
	private static int count=0;
	
	// 인스턴스 변수
	private int id;
	private int x = 0;
	private int y = 0;
	
	// 인스턴스 초기자(instance initializer), 인스턴스 블럭
	// 동작시점: 모든 생성자의 시작점에서 동작
	// 목적: 모든 생성자에서 공통적 해야 할 내용으 넣어줌 
	
	{
		this.id = ++count;
	}
	
	// 생성자 오버로딩
	// 기본 생성자
	public XY() {
		//this.id = ++count;
	}
	
	// 매개변수가 1개인 생성자
	public XY(int x) {
		//this.id = ++count;
		this.x = x;
	}
	
	// 매개변수가 2개인 생성자
	public XY(int x, int y) {
		//this.id = ++count;
		this.x = x;
		this.y = y;
	}
	
	// 복사 생성자
	public XY(XY a) {
		//this.id = ++count;
		this.x = a.x;
		this.y = a.y;
	}
	
	// 	출력
	public String toString() {
		return String.format("No. %d: (%d, %d)", id, x, y);
	}
}
public class XYTest01 {
	public static void main(String[] args) {
		XY p1 = new XY();
		XY p2 = new XY(10);
		XY p3 = new XY(20, 30);
		XY p4 = new XY(p3);
		
		System.out.println(p1.toString());
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
	}
}

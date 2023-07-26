/*
 
 */

class Static {
	private static int s;
	private int i;
	
	public static void sm1() { }
	public void im1() { }
	
	// 클래스 메소드
	public static void sm2(int x) {
		s = x;
		//i = x;
		sm1();
		//im1();
	}
	
	// 인스턴스 메소드
	public void im2(int x) {
		
	}
	
	// getter - 클래스 메소드
	public static int getS() {
		return s;
	}
	
	// getter - 인스턴스 메소드
	public int getI() {
		return i;
	}
}

public class StaticTest01 {
	
	static int add(int x, int y) {
		return x + y;
	}
	public static void main(String[] args) {
		Static s1 = new Static();
		Static s2 = new Static();
		Static s3 = new Static();
		
		s1.im2(10);
		
		System.out.println("s1's i: " + s1.getI());
		System.out.println("s2's i: " + s2.getI());
		System.out.println("s3's i: " + s3.getI());
		
		System.out.println("Static' s: " + Static.getS());
		
	}
}

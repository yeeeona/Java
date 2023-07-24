/*
오버로딩(Overloading)
1. 메소드의 다중 정의
2. 메소드의 이름은 같지만, 매개변수의 개수나 타입을 다르게 정의하는 것.
주의) 매개변수의 이름은 오버로딩에 해당하지 않음.
 */

public class Method10 {
	// 매개변수: 정수 2개
	static int add(int a, int b) {
		return a + b;
	}
	/* 
	에러 -> 중복 정의
	static int add(int x, int y) {
		return x + y;
	}
	*/
	
	// 매개변수: 실수 2개
	static double add(double x, double y) {
		return x + y;
	}
	/* 
	에러 -> 중복 정의
	static int add(double x, double y) {
		return (int)x + y;
	}
	*/
	static int add(int n) {
		return ++n;
	}
	
	public static void main(String[] args) {
		
		System.out.println(add(10, 20));
		System.out.println(add(3.5, 5.2));
		System.out.println(add(10));
	}
}

package calc;

// 패키지(package)
// 1. 역할: 비슷한 기능끼리 묶음. 패키지에 따라 접근을 제한함
// 2. 패키지 이름: 전체를 소문자로 작성. 도메인명을 역순으로 작성할 것을 권장.
// ex) www.example.co.kr -> kr.co.example.www


// 클래스의 접근 제한(한정) - 2가지
// 1. public 액세스 - 클래스 앞에 public을 적는 경우, 어디에서나 접근이 가능함
// 2. package(default) 액세스 - 클래스 앞에 아무 것도 적지 않는 경우, 같은 package 안에서만 접근 가능함

// 클래스의 멤버에 대한 접근 제한 - 4가지
// 1. public - 어디에서나 접근이 가능
// 2. protected - 상속을 받았다면 패키지가 달라도 접근 가능.
// 3. package(default) - 같은 패키지에서만 접근 가능, 멤버에 아무 것도 적지 않은 경우
// 4. private - 같은 클래스 안에서만 접근

public class Calc {
	
	public int add(int x, int y) {
		return x + y;
	}
	
	public int subtract(int x, int y) {
		return x - y;
	}
	
	public int multiply(int x, int y) {
		return x * y;
	}
	
	public int divide(int x, int y) {
		return x/y;
	}
	
}

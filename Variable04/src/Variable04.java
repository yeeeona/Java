
public class Variable04 {
	public static void main(String[] args) {
		float a = 3.14F; // F, f -> 실수형 값을 float로 인식하게 하는 식별자
		long b = 2200000000L; // L, l -> 정수형 값을 long으로 인식하게 하는 식별자
		
		byte c = 127; // 1byte인 c에 4byte로 취급하는 정수 상수를 대입하더라도 자바에서는 자동으로 변환해서 계산
		
		char ch = 'A'; // 문자는 1문자, 홀따옴표 사용
		String str = "JAVA"; // 문자열은 1문자 이상, 쌍따옴표 사용
		
		System.out.println(ch);
		System.out.println(str);
		
	}

}

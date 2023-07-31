
public class StringBufferTest01 {
	public static void main(String[] args) {
		// String 클래스의 문제점: 문자열의 추가, 삭제시에 매번 인스턴스를 변경한다.
		// 추가 전의 인스턴스와 추가 후의 인스턴스의 해시코드가 다르다.
		// String 클래스의 특징: immutable한 특징
		String s1 = "ABC";
		System.out.println(s1);
		System.out.println(System.identityHashCode(s1));
		
		s1 += "DEF";
		// s1 = s1.concat("DEF");
		System.out.println(s1);
		System.out.println(System.identityHashCode(s1));
		System.out.println("----");
		
		// StringBuffer: String 클래스의 문제점을 보완하는 클래스
		// 문자열의 추가, 삭제시에 자신의 인스턴스를 그대로 증가, 감소시켜 사용한다.
		// 추가 전의 인스턴스와 추가 후의 인스턴스의 해시코드가 같다.
		// StringBuffer 클래스의 특징: mutalbe한 특징 
		StringBuffer sb1 = new StringBuffer("ABC");
		System.out.println(sb1);
		System.out.println(System.identityHashCode(sb1));
		
		// sb1 += "DEF";
		sb1.append("DEF");
		System.out.println(sb1);
		System.out.println(System.identityHashCode(sb1));

	}

}


public class StringBufferTest02 {
	public static void main(String args) {
		StringBuffer sb1 = new StringBuffer("ABC");
		StringBuffer sb2 = new StringBuffer("ABC");
		
		System.out.println(sb1);
		System.out.println(sb2);
		System.out.println(System.identityHashCode(sb1));
		System.out.println(System.identityHashCode(sb2));
		System.out.println("-------");
		
		// 참조를 비교
		if(sb1 == sb2) {
			System.out.println("참조가 같습니다.");
		} else {
			System.out.println("참조가 다릅니다.");
		}
		
		// 값을 비교 -> 문제점
		// StringBuffer 클래스의 Object 클래스의 equals() 메소드를 그대로 사용
		// Object 클래스의 equals() 메소드는 참조를 비교함.
		if(sb1.equals(sb2)) {
			System.out.println("참고가 같습니다.");
		} else {
			System.out.println("참고가 다릅니다");
		}
		System.out.println("------");
		
		// 해결책: StringBuffer 클래스로 값 비교하지 말고, String 클래스로 변경하여 비교함.
		// String 클래스의 equals() 메소드는 Object 클래스의 equals() 메소드를 값을 비교하도록 오버라이딩 해놓았기 때문.
		
		// 1. toString(): StringBuffer를 String 형으로 변형하는 메소드
		String s1 = sb1.toString();
		String s2 = sb2.toString();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		
		if(s1 == s2) {
			System.out.println("참조가 같습니다.");
		} else {
			System.out.println("침조가 다릅니다.");
		}
		
		if(s1.equals(s2)) {
			System.out.println("값이 같습니다.");
		} else {
			System.out.println("값이 다릅니다.");
		}
		
	}

}

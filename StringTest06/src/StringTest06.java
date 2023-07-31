
public class StringTest06 {

	public static void main(String[] args) {
		String s1 = "Hello Java World!";
		
		// 1. charAt(): 인덱스에 해당하는 한 문자를 리턴하는 메소드
		char c = s1.charAt(6);
		System.out.println(c);
		
		// 2. concat(): 문자열을 이어 붙여서 새로운 문자열을 생성하는 메소드
		// s1 = s1.concat("Korea");
		s1 = s1 + "Korea";
		System.out.println(s1);
		
		// 3. contains(): 문자열에서 찾는 문자(
		System.out.println(s1.contains("J"));
		System.out.println(s1.contains("Java"));
		System.out.println(s1.contains("java"));
		System.out.println(s1.contains("Korea"));
		System.out.println(s1.contains("korea"));
	}

}

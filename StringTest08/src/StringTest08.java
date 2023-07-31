
public class StringTest08 {

	public static void main(String[] args) {
		String s1 = "Hello Java World!";
		
		// 8. length(): 문자열의 길이를 알려주는 메소드 
		System.out.println(s1.length());
		
		// 9. replace(A, B): A를 B로 바꿈
		s1 = s1.replace("!", "?");
		System.out.println(s1);
		s1 = s1.replace("Java", "Android");
		System.out.println(s1);
		s1 = s1.replace("l", "L");
		System.out.println(s1);
	

	}

}

import java.util.Scanner;

public class StringTest04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 입력 1: ");
		String s1 = sc.next();
		System.out.print("문자열 입력 2: ");
		String s2 = sc.next();
		
		// == 연산자는 참조형은 참조를 비교함.
		if(s1 == s2) {
			System.out.println("두 개의 문자열의 참조가 같습니다.");
		} else {
			System.out.println("두 개의 문자열의 참조가 다릅니다.");
		}
		System.out.println("--------");
		
		// equals() 메소드는 문자열의 참조가 아닌 값을 비교함. 영문자의 대소문자를 엄격하게 구분하여 비교
		if(s1.equals(s2)) {
			System.out.println("두 개의 문자열의 값이 같습니다.");
		} else {
			System.out.println("두 개의 문자열의 값이 다릅니다.");
		}
		System.out.println("--------");
		
		if(s1.equalsIgnoreCase(s2)) {
			System.out.println("두 개의 문자열이 같습니다.");
		} else {
			System.out.println("두 개의 문자열이 다릅니다.");
		}
		System.out.println("--------");
		
		
		
		sc.close();

	}

}

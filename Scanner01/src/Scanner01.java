
import java.util.Scanner;

public class Scanner01 {
	public static void main(String[] args) {
		// 입력하는 방법
		Scanner sc = new Scanner(System.in);
		
		// 1번 - 정수 입력
		System.out.println("정수 입력: ");
		int a = sc.nextInt();
		
		System.out.println("a = " + a);
		// 2번 - 실수 입력
		System.out.println("실수 입력: ");
		double b = sc.nextDouble();
		
		System.out.println("b = " + b);
		// 3번 - 문자열 입력
		System.out.println("문자열 입력: ");
		String s = sc.next();
		
		System.out.println("s = " + s);
		
		sc.close();
	}
}

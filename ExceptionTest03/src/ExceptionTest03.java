import java.util.Scanner;

/*
 < try ~ catch문의 동작 원리 > 
 - try - catch문은 쌍으로 동작한다.
 - try문에서 예외가 발생하면 그 즉시 catch문으로 이동함.
 - try문에서 예외가 발생하지 않으면 catch문으로 이동하지 않음.
*/
public class ExceptionTest03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 a 입력: ");
		int a = sc.nextInt();
		System.out.print("정수 b 입력: ");
		int b = sc.nextInt();
		int quotient = 0;
		int remainder = 0;
		
		// 예외 발생: 0으로 나눌 때
		// 예외 발생: java.lang,AruthmeticException: / by zero
		try {
			quotient = a/b;
			remainder = a%b;
		} catch(ArithmeticException e) {
			e.printStackTrace();
		}
		
		System.out.println("몫: " + quotient);
		System.out.println("나머지: " + remainder);
		System.out.println("예외가 발생하면, 예외를 처리하고, 계속 실행되어야 한다.");
		
		sc.close();
	}

}


import java.util.Scanner;

public class If09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 정수 입력: ");
		int n1 = sc.nextInt();
		System.out.println("첫번째 정수 입력: ");
		int n2 = sc.nextInt();
		System.out.println("연산자 입력: ");
		String op = sc.next();
		
		
		// 계산, 출력 화면
		// -> 문제점: 잘못된 결과, == 은 참조(객체형)에 대해서는 참조를 비교, 값을 비교하는 것이 아님.\
		// -> 해결책: 문자열의 값의 비교는 equals() 메소드를 사용한다.
		/*
		if(op == "+") {
			System.out.printf("%d %s %d = %d\n", n1, op, n2, (n1+n2));
		} else if(op == "-") {
			System.out.printf("%d %s %d = %d\n", n1, op, n2, (n1-n2));
		} else if(op == "*") {
			System.out.printf("%d %s %d = %d\n", n1, op, n2, (n1*n2));
		} else if(op == "/") {
			System.out.printf("%d %s %d = %d\n", n1, op, n2, (n1/n2));
		} else if(op == "%") {
			System.out.printf("%d %s %d = %d\n", n1, op, n2, (n1%n2));
		} else {
			System.out.println("다른 연산자를 입력하세요.");
		}
		*/
		
		if(op.equals("+")) {
			System.out.printf("%d %s %d = %d\n", n1, op, n2, (n1+n2));
		} else if(op.equals("-")) {
			System.out.printf("%d %s %d = %d\n", n1, op, n2, (n1-n2));
		} else if(op.equals("*")) {
			System.out.printf("%d %s %d = %d\n", n1, op, n2, (n1*n2));
		} else if(op.equals("/")) {
			System.out.printf("%d %s %d = %d\n", n1, op, n2, (n1/n2));
		} else if(op.equals("%")) {
			System.out.printf("%d %s %d = %d\n", n1, op, n2, (n1%n2));
		} else {
			System.out.println("다른 연산자를 입력하세요.");
		}
		sc.close();
	}
}

import java.util.Scanner;

public class If10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 입력 화면
		System.out.println("첫번째 정수 입력: ");
		int n1 = sc.nextInt();
		System.out.println("첫번째 정수 입력: ");
		int n2 = sc.nextInt();
		System.out.println("연산자 입력: ");
		char op = sc.next().charAt(0); // 문자열 중에서 첫번째 문자만 저장
		
		// 계산
		if(op == '+') {
			System.out.printf("%d %s %d = %d\n", n1, op, n2, (n1+n2));
		} else if(op == '-') {
			System.out.printf("%d %s %d = %d\n", n1, op, n2, (n1-n2));
		} else if(op == '*') {
			System.out.printf("%d %s %d = %d\n", n1, op, n2, (n1*n2));
		} else if(op == '/') {
			System.out.printf("%d %s %d = %d\n", n1, op, n2, (n1/n2));
		} else if(op == '%') {
			System.out.printf("%d %s %d = %d\n", n1, op, n2, (n1%n2));
		} else {
			System.out.println("다른 연산자를 입력하세요.");
		}
		sc.close();
	}
}

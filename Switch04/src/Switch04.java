import java.util.Scanner;

public class Switch04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 입력
		System.out.println("첫번째 정수: ");
		int n1 = sc.nextInt();
		System.out.println("두번째 정수: ");
		int n2 = sc.nextInt();
		System.out.println("첫번째 정수: ");
		char op = sc.next().charAt(0);
		
		switch(op) {
		case '+':
			System.out.printf("%d + %d = " + (n1 + n2));
			break;
		case '-':
			System.out.printf("%d + %d = " + (n1 - n2));
			break;
		case '*':
			System.out.printf("%d + %d = " + (n1 * n2));
			break;
		case '/':
			System.out.printf("%d + %d = " + (n1 / n2));
			break;
		case '%':
			System.out.printf("%d + %d = " + (n1 % n2));
			break;
		default:
			System.out.println("잘못된 연산입니다.");
			break;
		}
		
		
		sc.close();
	}

}

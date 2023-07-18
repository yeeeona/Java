import java.util.Scanner;

public class If11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 입력
		System.out.println("정수 a 입력: ");
		int a = sc.nextInt();
		System.out.println("정수 b 입력: ");
		int b = sc.nextInt();
		
		// 계산
		if(a>b) {
			System.out.println("a = " + b);
			System.out.println("b = " + a);
		}
		
		// 출력
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		sc.close();
	}

}

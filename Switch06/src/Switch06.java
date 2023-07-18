// 정수 1개를 입력하여, 홀수인지 짝수인지를 판별하는 프로그램을 작성하시오.

import java.util.Scanner;

public class Switch06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 입력
		System.out.println("정수를 입력하세요: ");
		int n = sc.nextInt();
		
		// switch~case문
		switch(n%2) {
		case 0:
			System.out.printf("%d은 짝수입니다.", n);
			break;
		case 1:
			System.out.printf("%d은 홀수입니다.", n);
			break;
		default:
			System.out.println("정수를 입력하세요");
			break;
		}
		sc.close();
	}
}

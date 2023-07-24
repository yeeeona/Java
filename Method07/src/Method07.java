// 문제7) 정수 1개와 기호 1개를 입력하여, 좌하변이 직각인 직각삼각형을 출력하시오.
// 메소드명: putChar()

import java.util.Scanner;

public class Method07 {
		
		static void putChar(int n, char c) {
			for(int i=1; i<=n; i++) {
				System.out.print(c);
			}
		}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력: ");
		int n = sc.nextInt();
		System.out.print("기호 입력: ");
		char c = sc.next().charAt(0);
		
		for(int i=1; i<=n; i++) {
			putChar(i, c);
			/*
			for(int j=1; j<=i; j++) {
				System.out.print(c);
			}
			*/
			System.out.println();
		}
			sc.close();
	}

}

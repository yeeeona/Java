/*
 * < 메소드를 생성하는 규칙>
 * 1. 매개변수의 개수와 타입은 반드시 일치해야 한다.
 * 2. 리턴값과 리턴 타입은 반드시 일치해야 한다.
 * 3. 리턴값은 반드시 1개 또는 0개이어야 한다.
 */

import java.util.Scanner;

public class Method02 {
	// 메소드 생성
	static int add(int x, int y) {
		int z = x + y;
		return z;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 a 입력: ");
		int a = sc.nextInt();
		System.out.print("정수 b 입력: ");
		int b = sc.nextInt();
		
		int c = add(a, b); // 메소드 호출(사용)
		
		System.out.println("합계: " + c);
		
		sc.close();
	}

}

/*
 * 배열(Array) - 같은 타입의 변수의 집합
 * 
 * 배열의 장점 - 1. 같은 종류의 값을 모아서 관리 2. 반복문을 통한 일괄 처리
 */

// 배열을 사용하지 않고, 학생 5명의 점수를 입력하여, 총점과 평균을 구함.
// 배열을 사용하지 않았을 때의 문제점 파악
// - 코드의 중복, 일관 처리 불가능, 내용에 변경이 생기면 계속 코드를 수정하여야한다. -> 유지보수 어려움

import java.util.Scanner;

public class Array01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		double ave = 0.0;
		
		System.out.print("1번 학생 점수: ");
		int s1 = sc.nextInt();
		
		System.out.print("2번 학생 점수: ");
		int s2 = sc.nextInt();
		
		System.out.print("3번 학생 점수: ");
		int s3 = sc.nextInt();
		
		System.out.print("4번 학생 점수: ");
		int s4 = sc.nextInt();
		
		System.out.print("5번 학생 점수: ");
		int s5 = sc.nextInt();
		
		sum = s1 + s2 + s3 + s4 + s5;
		ave = (double)sum / 5;
		
		System.out.printf("총점: %d\n평균: %.2f", sum, ave);
		
		sc.close();
	}

}

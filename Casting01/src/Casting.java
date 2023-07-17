/*
 퀴즈2번) 국어, 영어, 수학 점수를 입력하여, 총점과 평균 구하시오.
 변수명: kor, eng, mat, sum, ave(실수)
 */

import java.util.Scanner;

public class Casting {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어 점수 입력: ");
		int kor = sc.nextInt();
		System.out.println("영어 점수 입력: ");
		int eng = sc.nextInt();
		System.out.println("수학 점수 입력: ");
		int mat = sc.nextInt();
		
		// 총점, 평균 계산
		// 문제점: 소수점 이하가 나오지 않음.
		// 캐스팅(Casting): 강제로 데이터타입을 변환하는 것
		// 이항 수치 승격
		int sum = kor + eng + mat;
		double ave = (double)sum / 3;
		
		// 출력 화면
		System.out.println("총점: " + sum);
		System.out.println("평균: " + ave);
		
		sc.close();
		
		
	}
}
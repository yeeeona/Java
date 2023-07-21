// 문제1) 학생 점수 10개를 입력하여 scores 배열에 저장하고,
// 배열의 점수 중에서 최고점수와 최저점수값을 구하시오.

import java.util.Scanner;

public class ArrayTest01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [] scores = new int[10];
		
		// 입력
		for(int i=0; i<scores.length; i++) {
			System.out.printf("%2d번째 학생 점수 입력: ", i+1);
			scores[i] = sc.nextInt();
		}
		
		// 최고점수, 최저점수
		int max = scores[0];
		int min = scores[0];
		
		for (int i=1; i<scores.length; i++) {
			if(max < scores[i]) {
				max = scores[i];
			}
			if(min > scores[i]) {
				min = scores[i];
			}
		}
		
		// 출력
		System.out.println("---- 학생 점수 출력 ----");
		for(int i=0; i<scores.length; i++) {
			System.out.print(scores[i] + " ");
		}
		System.out.println("\n최고점수: " + max);
		System.out.println("최저점수: " + min);
		
		
		sc.close();
	}

}

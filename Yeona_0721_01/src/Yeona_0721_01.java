/*
 * 과제1) Array2D03 프로젝트에서 입력부분을 추가하여, 학생 성적 관리 프로그램을 완성하시오.
 * 1. 학생 수를 정하고, 각 학생마다 과목수를 정하여 scores 배열을 생성하시오.
 * 2. 학생마다 과목 점수를 입력하여 scores 배열에 데이터를 저장하시오.
 * 3. 출력 부분에는 석차를 추가하시오(평균)
 */
import java.util.Scanner;

public class Yeona_0721_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 학생 수 입력 받기
		System.out.print("점수를 입력할 학생 수를 입력하세요.: ");
		int student = sc.nextInt();
		
		// 학생 n명의 국어, 영어, 수학, 총점을 저장하는 2차원 배열
		int[][] scores = new int[student][3];
		
		// 입력한 값을 배열의 추가
		for(int i=0; i<scores.length; i++) {
			for(int j=0; j<scores[i].length; j++) {
				System.out.printf("%d번째 학생 점수 입력(국어, 영어, 수학): ", i +1);
				int n = sc.nextInt();
				scores[i][j] += n; 
			}
			System.out.println();
		}
		
		// 총점을 저장하는 배열 - 정수형
		int[] tot = new int[student];
		// 평균을 저장하는 배열 - 실수형
		double[] avgs = new double[student];
		// 석차를 저장하는 배열 
		char[] grade = new char[student];
		
		// 총점과 펑균을 계산
		for(int i=0; i<scores.length; i++) {
			for(int j=0; j<scores[i].length; j++) {
				tot[i] += scores[i][j];
			}
			avgs[i] = (double)tot[i] / 3;
		}
		
		// 석차 계산
		for(int i=0; i<avgs.length; i++) {
			if(avgs[i]>=90) {
				grade[i] += 'A'; 
			} else if(avgs[i]>=80) {
				grade[i] += 'B';
			} else if(avgs[i]>=70) {
				grade[i] += 'C';
			} else if(avgs[i]>=60) {
				grade[i] += 'D';
			} else {
				grade[i] += 'F';
			}
		}
		
		// 출력
		// 국어 | 영어 | 수학 | 총점 | 평균 | 석차
		System.out.println("       | 국어 | 영어 | 수학 | 총점  |  평균   |석차|");
		System.out.println("  -------------------------------------------");
		for(int i =0; i<scores.length; i++) {
			System.out.printf("%d번 학생 | ", i+1);
			for(int j=0; j<scores[i].length; j++) {
				System.out.printf("%3d | ", scores[i][j]);
			
			}
			System.out.printf("%d | ", tot[i]);
			System.out.printf("%.2f | ", avgs[i]);
			System.out.printf("%c | \n", grade[i]);
 		}
		sc.close();
	}	
}

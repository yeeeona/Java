
// 문제1) 학생 5명의 3과목의 점수를 더하여 총점과 평균을 계산하시오.

public class Array2D03 {
	public static void main(String[] args) {
		// 학생 5명의 국어, 영어, 수학, 총점을 저장하는 2차원 배열
		int[][] scores = new int[][] {
			{93, 93, 92, 0},
			{85, 85, 86, 0},
			{71, 71, 72, 0},
			{68, 68, 67, 0},
			{83, 83, 82, 0},
		};
		
		// 평균을 저장하는 배열 - 실수형
		double[] avgs = new double[5];
		// double[] avgs = {0.0, 0.0, 0.0, 0.0, 0.0};
		
		// 총점과 펑균을 계산
		for(int i=0; i<scores.length; i++) {
			for(int j=0; j<scores[i].length-1; j++) {
				scores[i][3] += scores[i][j];
				
			}
			avgs[i] = (double)scores[i][3] / 3;
		}
		// 출력
		// 국어 | 영어 | 수학 | 총점 | 평균
		System.out.println("     |  국어 | 영어 | 수학 | 총점 | 평균   |");
		System.out.println("  ------------------------------------");
		for(int i =0; i<scores.length; i++) {
			System.out.printf("%3d번 | ", i+1);
			for(int j=0; j<scores[i].length; j++) {
				System.out.printf("%3d | ", scores[i][j]);
			}
			System.out.printf("%.2f |\n", avgs[i]);
 		}
		
	}
}

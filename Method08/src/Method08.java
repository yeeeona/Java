// 문제8) 학생의 총점, 평균, 학점을 구하는 메소드를 만들어 사용하시오.
// 메소드명: getSum(), getAvg(), getGrade()

import java.util.Scanner;

public class Method08 {
	
	static int getSum(int [] s) {
		int sum=0;
		for(int i=0; i<s.length; i++) {
			sum += s[i];
		}
		return sum;
	}
		
	static double getAvg(int sum, int s) {
		double avg = (double)sum / s;
		return avg;
	}
	
	static char getGrade(double avg) {
		char grade;
		switch((int)avg/10) {
		case 10: case 9: grade ='A'; break;
		case 8: grade ='B'; break;
		case 7: grade ='C'; break;
		case 6: grade ='D'; break;
		default: grade ='F'; break;
		}
		return grade;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] scores = { 95, 77, 86, 64, 85};
		
		int sum = getSum(scores);
		double avg = getAvg(sum, scores.length);
		char grade = getGrade(avg);
		
		System.out.printf("총점: %d\n평균: %.2f\n학점: %c\n", sum, avg, grade);
		
		sc.close();
	}
}


import java.util.Scanner;

public class If05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어 점수 입력: ");
		int kor = sc.nextInt();
		System.out.println("영어 점수 입력: ");
		int eng = sc.nextInt();
		System.out.println("수학 점수 입력: ");
		int mat = sc.nextInt();
		
		int sum = kor + eng + mat;
		double ave = (double)sum / 3;
		
		char grade;
		
		if(ave>=90) {
			grade = 'A';
		} else if(ave>=80) {
			grade = 'B';
		} else if(ave>=70) {
			grade = 'C';
		} else if(ave>=60) {
			grade = 'D';
		} else if(ave>=50) {
			grade = 'E';
		} else {
			grade = 'F';
		}
		/*
		System.out.println("총점: " + sum);
		System.out.printf("평균: %f\n", ave);
		System.out.println("학점: " + grade);
		*/
		
		System.out.printf("총점: %d\n평균: %.2f\n학점: %c\n", sum, ave, grade);
		
		sc.close();
			
			
			
			
		
		
		
	
		
	}
}

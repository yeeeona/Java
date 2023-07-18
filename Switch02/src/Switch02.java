import java.util.Scanner;

public class Switch02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 입력
		System.out.println("국어점수: ");
		int kor = sc.nextInt();
		System.out.println("영어점수: ");
		int eng = sc.nextInt();
		System.out.println("수학점수: ");
		int mat = sc.nextInt();
		
		// 총점, 평균 계산
		int sum = kor + eng + mat;
		double ave = (double)sum / 3;
		
		// 학점 계산 -> switch~case문
		char grade;
		
		// ave/10 -> 92.33/10 -> double
		// 해결책: 캐스팅으로 double형을 int값으로 변경
		switch((int)ave/10) {
		case 10: case 9: grade = 'A'; break;
		case 8: grade = 'B'; break;
		case 7: grade = 'C'; break;
		case 6: grade = 'D'; break;
		default: grade = 'F'; break;
		}
		System.out.printf("총점: %d\n평균: %.2f\n학점: %c\n", sum, ave, grade);
		
		
		sc.close();
	}

}

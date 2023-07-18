import java.util.Scanner;

public class Switch05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 입력
		System.out.println("월(1~12)을 입력하세요: ");
		int month = sc.nextInt();
		
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.printf("%d월의 일수는 31일입니다", month);
			break;
		case 4: case 6: case 9: case 11:
			System.out.printf("%d월의 일수는 30일입니다", month);
			break;
		case 2:
			System.out.printf("%d월의 일수는 28일입니다", month);
			break;
		default:
			System.out.println("월을 잘못입력하셨습니다.");
			break;
		}
		sc.close();
	}
}

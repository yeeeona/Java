import java.util.Scanner;

public class If12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 입력
		System.out.println("월을 입력하세요.: ");
		int month = sc.nextInt();
		
		if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			System.out.printf("%d월의 일수는 31일입니다.", month);			
		} else if(month == 4 || month == 6 || month == 9 || month == 11) {
			System.out.printf("%d월의 일수는 30일입니다.", month);
		} else if(month == 2) {
			System.out.printf("%d월의 일수는 28일입니다.", month);
		} else {
			System.out.printf("잘못된 월을 입력하였습니다.");
		}
		
		
		sc.close();
	}
}

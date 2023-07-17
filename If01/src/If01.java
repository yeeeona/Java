
import java.util.Scanner;

public class If01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력: ");
		int n = sc.nextInt();
		
		// 1번 - 조건이 1개 일 때
		// 입력한 정수가 양수인지를 판별하시오.
		/*
		if(n > 0) {
			System.out.println(n + "은 양수입니다.");
		}
		*/
		
		// 2번 - 조건이 2개일 때
		// 입력 정수가 양수인지 음수인지를 판별하시오.
		/*
		if(n > 0) {
			System.out.println(n + "은 양수입니다.");
		} else {
			System.out.println(n + "은 음수입니다.");
		}
		*/
		
		// 3번 - 조건이 3개 이상일 때
		// 입력한 정수가 양수, 음수, 0인지를 판별하시오
		if(n > 0) {
			System.out.println(n + "은 양수입니다.");
		} else if(n < 0) {
			System.out.println(n + "은 음수입니다.");
		} else {
			System.out.println("0입니다.");
		}
		
		sc.close();
		
		
		
	}

}

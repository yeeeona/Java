
// 문제) 정수 1개를 입력하여 3의 배수이면서 4의 배수인지를 판별하시오.
import java.util.Scanner;

public class If02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 입력: ");
		int n = sc.nextInt();
		
		if(n%3 == 0 && n%4 == 0) {
			System.out.println(n + "은 3의 배수이면서 4의 배수 입니다.");
		} else {
			System.out.println(n + "은 3의 배수이면서 4의 베수가아닙니다.");
		}
		
		sc.close();
		
	}

}

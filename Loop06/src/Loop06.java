
import java.util.Scanner;

public class Loop06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("--- 구구단 프로그램을 시작합니다. ---");
		char yn;
		do {
			System.out.print("단을 입력: ");
			int n = sc.nextInt();
			
			for(int i=1; i<=9; i++) {
				System.out.printf("%d * %d = %d\n", n, i, n*i);
			}
			
			System.out.print("구구단을 계속 진행하시겠습니까?(y,n)");
			yn = sc.next().charAt(0);
		
		} while(yn == 'y');
		
		System.out.println("구구단 프로그램을 종료합니다.");
		sc.close();
	}

}

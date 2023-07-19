
import java.util.Scanner;

public class Loop2D04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("길이 입력: ");
		int n = sc.nextInt();
		
		
		// 1번
		/*
		for(int i=1; i<=n; i++) {
			for(int j=n; j>=i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		// 2번
		for(int i=1; i<=n; i++) {
			for(int j=i; j<=n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}

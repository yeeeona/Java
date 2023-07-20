
import java.util.Scanner;

public class Loop2D05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("길이 입력: ");
		int n = sc.nextInt();
		// 1번
		/*
		for(int i=1; i<=n; i++) {
			for(int j=n;j>i; j--) {
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		
		// 2번 - if문 활용
		for(int i= 1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(i+j >= n+1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		sc.close();
	}
}

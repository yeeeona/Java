
import java.util.Scanner;

public class Loop05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력: ");
		int n = sc.nextInt();
		
		int fac = 1;
		System.out.print(n + "! = ");
		for(int i=1; i<=n; i++) {
			fac *= i;
			if(i<n) {
				System.out.print(i + " * ");
				
			} else {
				System.out.print(i + " ");				
			}
		}
		System.out.print("= " + fac);
		sc.close();
	}
}


import java.util.Scanner;
public class Loop10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		System.out.print("첫번째 정수입력: ");
		int n1 = sc.nextInt();
		
		System.out.print("두번째 정수입력: ");
		int n2 = sc.nextInt();
		
		// 1번
		/*
		if(n1 < n2) {
			for(int i=n1; i<=n2; i++) {
				sum += i;
			}
			System.out.printf("%d에서 %d사이의 합은 %d입니다.\n", n1, n2, sum);
		} else {
			for(int i =n2; i<= n1; i++) {
				sum += i;
			}
			System.out.printf("%d에서 %d사이의 합은 %d입니다.\n", n2, n1, sum);
		}
		*/
		
		// 2번 - swapping
		if(n1 > n2) {
			int t = n1;
			n1 = n2;
			n2 = t;
		}
		
		for(int i = n1; i <=n2; i++) {
			sum += i;
		}
		System.out.printf("%d에서 %d사이의 합은 %d입니다.\n", n1, n2, sum);
		
		sc.close();
	}

}

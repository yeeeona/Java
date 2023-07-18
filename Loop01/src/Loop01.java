
// 문제1 정수 1개를 입력하여, 입력한 수까지 중에서 홀수를 출력하고,
// 홀수의 개수와 합계를 출력하시오.
import java.util.Scanner;

public class Loop01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 입력
		System.out.println("정수를 입력하세요.: ");
		int n = sc.nextInt();
		
		int cnt = 0;
		int sum = 0;
		for(int i=1; i<=n; i++) {
			if(i%2==1) {
				sum += i;
				cnt++;
				System.out.print(i + " ");
			}
		}
		System.out.printf("\n개수: %d\n합계: %d", cnt, sum);
		
		sc.close();
	}

}

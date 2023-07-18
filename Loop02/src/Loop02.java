
// 문제2) 정수 1개를 입력하여, 입력한 수까지 증에서 3의 배수 이면서 4의 배수를 출력.
// 합계와 개수를 구하시오.

import java.util.Scanner;

public class Loop02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하시오.: ");
		int n = sc.nextInt();
		
		int cnt = 0, sum = 0;
		for(int i=1; i<=n; i++) {
			if(i%3==0 && i%4==0) {
				sum += i;
				cnt++;
				System.out.print(i + " ");
			}
		}
		System.out.printf("\n합계: %d\n개수: %d", sum, cnt);
		sc.close();
	}
	
}

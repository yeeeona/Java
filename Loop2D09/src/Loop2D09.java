// 문제9) 정수 1개를 입력하여, 입력한 정수까지의 소수를 판별하야 출력하고,
// 합계와 개수를 구하시오.
// 소수는 1을 제외하고, 1과 자신으로만 나누어 떨어지는 수.
// 예) 2, 3, 5, 7, 11 ...
// 규칙) 1과 자산으로만 나누어 떨어져야한다. 자신이 되기 전에 나누어 떨어진다면 소수가 아니다.

import java.util.Scanner;

public class Loop2D09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요.: ");
		int n = sc.nextInt();
		
		int sum=0, cnt=0;
		for(int i=1; i<=n; i++) {
			for(int j=2; j<=n-1; j++) {
				if(n%j==0) {
					sum++;
					cnt++;
					System.out.print("i");
				} else {
					continue;
				}
				
			}
		}
		
		
		sc.close();
	}

}

// 문제9) 정수 1개를 입력하여, 입력한 정수까지의 소수를 판별하야 출력하고,
// 합계와 개수를 구하시오.
// 소수는 1을 제외하고, 1과 자신으로만 나누어 떨어지는 수.
// 예) 2, 3, 5, 7, 11 ...
// 규칙) 1과 자산으로만 나누어 떨어져야한다. 자신이 되기 전에 나누어 떨어진다면 소수가 아니다.

import java.util.Scanner;

public class Loop2D09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tot = 0, cnt =0;
		
		System.out.print("정수를 입력하세요.: ");
		int n = sc.nextInt();
		
		for(int i=2; i<=n; i++) {
			for(int j=2; j<=i; j++) {
				if(i == j) {
					System.out.print(i + " ");
					tot += i;
					++cnt;
				}
				if(i%j == 0) {
					break;
				}
				
			}
		}
		
		System.out.printf("\n2에서 %d까지의 소수의 합계: %d\n", n, tot);
		System.out.printf("2에서 %d까지의 소수의 개수: %d\n", n, cnt);
		
		sc.close();
	}

}

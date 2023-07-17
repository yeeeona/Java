
// 문제) 정수 1개를 입력하여 홀수인지, 짝수인지를 판별하시오.

import java.util.Scanner;

public class If03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수입력: ");
		int n = sc.nextInt();
		
		if(n%2 == 0) {
			System.out.println(n +"은 짝수입니다.");
		} else {
			System.out.println(n +"은 홀수입니다.");
		}
		
		sc.close();
	}

}

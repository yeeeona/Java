// 문제1) 정수 1개를 입력하여, 입력한 수를 거꾸로 출력하시오.
// 정수로 처리하도록 함. 문자열로 처리하지않음.


import java.util.Scanner;

public class LoopTest01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력: ");
		int n = sc.nextInt();
		
		while(n > 0) {
			System.out.print(n%10);
			n /= 10;
			
		}
		
		sc.close();
	}

}

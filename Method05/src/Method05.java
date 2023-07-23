// 문제3) 3개의 정수를 입력하여, 최대값과 최소값을 구하는 프로그램을 작성하시오.
// 최대값과 최소값은 메소드를 생성하여 사용하시오.
// 메소드명: calcMax(), calcMin()

import java.util.Scanner;

public class Method05 {
	
	// 최대값
	static int caleMax(int x, int y, int z) {
		int max = x;
		if(max < y) {
			max = y;
		} 
		if(max < z) {
			max = z;
		}
		return max;
	}
	
	// 최소값
	static int caleMin(int x, int y, int z) {
		int min = x;
		if(min > y) {
			min = y;
		}
		if(min > z) {
			min = z;
		}
		return min;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1번쨰 정수 입력: ");
		int n1 = sc.nextInt();
		System.out.print("2번쨰 정수 입력: ");
		int n2 = sc.nextInt();
		System.out.print("3번쨰 정수 입력: ");
		int n3 = sc.nextInt();
		
		int max = caleMax(n1, n2, n3);
		int min = caleMin(n1, n2, n3);
		
		System.out.printf("%d %d %d\n", n1, n2, n3);
		System.out.printf("최대값: %d\n최소값: %d", max, min);
		sc.close();
		
	}

}

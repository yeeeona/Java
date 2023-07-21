// 문제2) 실수 1개(x) 정수 1개(y)를 입력하여, x의 y승을 구하는 프로그램을 작성하시오.
// x의 y승을 구하는 부분을 메소드로 만들어 사용하시오.
// 메소드명: calcPower()

import java.util.Scanner;

public class Method04 {
	
	static double calcPower(double x, int y) {
		
		double power = 1;
		for(double i=1; i<=y; i++) {
			power *= x;
		}
		return power;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("실수 x 입력: ");
		double x = sc.nextDouble();
		System.out.print("정수 y 입력: ");
		int y = sc.nextInt();
		
		double power = calcPower(x, y);
		
		System.out.printf("%.2f의 %d승은 %f입니다.", x, y, power);
		
		sc.close();
	}

}


/* 변수, 연산자, 입력, 출력에 퀴즈
1. 원의 반지름과 원주율을 입력하여, 원의 둘레와 원의 면적을 구하는 프로그램을 작성하시오
변수: radius, pi, perimeter, area
< 입력 화면>
반지름 입력: 5.5
원주율 입력: 3.14

< 출력 화면>
원의 둘레: 000
원의 면적: 000
*/
import java.util.Scanner;

public class Scanner02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("반지름을 입력: ");
		double radius = sc.nextDouble();
		
		System.out.println("원주율을 입력: ");
		double pi = sc.nextDouble();
		
		// 원의 둘레, 면적 계산
		double perimeter = 2 * pi * radius;
		double area = pi * radius * radius;
		
		System.out.println("원의 둘레: " + perimeter);
		System.out.println("원의 면적: " + area);
		
		sc.close();
		
	}
}

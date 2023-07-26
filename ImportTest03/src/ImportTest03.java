// lang 패키지: 자바에서 필수적으로 사용하는 클래스들을 모아 놓은 특별한 패키지
// - lang 패키지 안의 클래스들은 따로 import 하지 않아도 사용이 가능함. -> 컴파일하면서 자동으로 import함.abstract
// - lang 패키지 안의 클래스: Math, System, String, Object, Exception ... 


import java.util.Scanner;

public class ImportTest03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("반지름 입력: ");
		double radius = sc.nextDouble();
		System.out.print("x값 입력: ");
		int x = sc.nextInt();
		System.out.print("y값 입력: ");
		int y = sc.nextInt();
		System.out.print("음수 입력: ");
		int n = sc.nextInt();
		
		double perimeter = 2 * Math.PI * radius;
		double area = Math.PI * radius * radius;
		double distance = Math.sqrt(x*x + y*y);
		int p = Math.abs(n);
		
		System.out.println("원의 둘레: " + perimeter);
		System.out.println("원의 면적: " + area);
		System.out.println("거리: " + distance);
		System.out.println("절대값: " + p);
		
		sc.close();
	}

}

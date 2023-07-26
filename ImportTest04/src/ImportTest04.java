import java.util.Scanner;

// 주문형 static import 
import static java.lang.Math.*;

// 수학과 관련된 공식이 아주 많은 클래스라고 가정하면, ㅔㅐ 
public class ImportTest04 {
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
		
		double perimeter = 2 * PI * radius;
		double area = PI * radius * radius;
		double distance = sqrt(x*x + y*y);
		int p = Math.abs(n);
		
		System.out.println("원의 둘레: " + perimeter);
		System.out.println("원의 면적: " + area);
		System.out.println("거리: " + distance);
		System.out.println("절대값: " + p);
		
		sc.close();
	}
}

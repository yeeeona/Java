
import java.util.Scanner;
public class Loop09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double power = 1.0;
		
		System.out.print("실수를 입력하세요.: ");
		double x = sc.nextDouble();
		
		System.out.print("정수를 입력하세요.: ");
		int y = sc.nextInt();
		
		
		for(int i=1; i<=y; i++) {
			power *= x;
		}
		
		System.out.printf("%f의 %d승은 %f입니다.", x, y, power);
		sc.close();
	}

}

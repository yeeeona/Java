
// printf() 메소드와 서식 문자
// %:서식 문자
// d: decimal, 10진 정수형
// f: float, 실수
public class Print01 {
	public static void main(String[] args) {
		// 정수 출
		int a = 34567, b= 12345;
		
		System.out.printf("%d\n", a);
		System.out.printf("%10d\n", a);
		System.out.printf("%-10d\n", a); // 오른쪽 맞춤
		System.out.printf("%d %d\n", a, b); // 왼쪽 맞춤
		
		// 실수 출력
		double c = 3.141592;
		System.out.printf("%f\n", c);
		System.out.printf("%6.2f\n", c); // 전체 자리수.소수점 이하 자리수
		System.out.printf("%8.4f\n", c); // 소수점 이하는 반올림해서 출력함.
		System.out.printf("%-6.2f@\n", c);
		System.out.printf("%.2f", c);
		System.out.printf("%.4f\n", c);
	}
}


public class Operator02 {
	public static void main(String[] args) {
		
		System.out.println(47 & 73);
		System.out.println(47 | 73);
		System.out.println(47 ^ 73);
		System.out.println(~ 47);
		
		// 6. 쉬프트 연산자
		int a = 2, b = 64;
		System.out.println(a << 4);
		System.out.println(b >> 3);
		
		// 7. 조건 선택 연산자 - ? :
		// 조건 ? 참 : 거짓
		a = 10;
		b = 5;
		int c;
		
		c = a < b ? a : b;
		System.out.println(c);
		
	}
}

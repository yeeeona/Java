
public class Printf02 {
	public static void main(String[] args) {
		
		// 3. 문자 출력
		char ch = 'A';
		System.out.printf("%c\n", ch);
		System.out.printf("%5c\n", ch);
		System.out.printf("%-5c\n", ch);
		
		// 문자열 출력
		String str = "JAVA";
		System.out.printf("%s\n", str);
		System.out.printf("%8s\n", str);
		System.out.printf("%-8s\n", str);
		
		// 5. 8진수 출력
		int x = 9, y = 15;
		System.out.printf("%d %d\n", x, y);
		System.out.printf("%o %o\n", x, y);
		
		// 6. 16진수 출력
		System.out.printf("%x %x\n", x, y);
		System.out.printf("%X %X\n", x, y);
		
	}
}

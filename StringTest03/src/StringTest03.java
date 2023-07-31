import java.util.Scanner;

public class StringTest03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 입력 1: ");
		String s1 = sc.next();
		System.out.print("문자열 입력 2: ");
		String s2 = sc.next();
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println("------");
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println("-----");
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		
		
		sc.close();

	}

}

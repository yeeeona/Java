import java.util.Scanner;

public class ImportTest01 {
	public static void main(String[] args) {
		// 1. 완전 수식명(Full Qualifed Name, FQN)
		//java.util.Scanner sc = new java.util.Scanner(System.in);
		
		// 2. 단순명
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력: ");
		int n = sc.nextInt();
		
		System.out.println("n = " + n);
		
		sc.close();
	}

}

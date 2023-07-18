
import java.util.Scanner;

public class Loop03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("단을 입력하세요.: ");
		int n = sc.nextInt();
		
		for(int i=1; i<=9; i++) {
			System.out.printf("%d * %d = %d\n", n, i, n*i);
		}
		
		sc.close();

	}

}


import java.util.Scanner;

public class Loop04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요: ");
		int n = sc.nextInt();
		
		int sum = 0, cnt = 0;
		for(int i=1; i<=n; i++) {
			if(n%i==0) {
				sum += i;
				cnt++;
				System.out.print(i + " ");
			}
		}
		System.out.printf("\n합계: %d\n개수: %d", sum, cnt);
		sc.close();
		
		
	}

}


import java.util.Scanner;

public class Loop2D02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로 길이 입력: ");
		int w = sc.nextInt();
		
		System.out.print("세로 길이 입력: ");
		int h = sc.nextInt();
		
		for(int i = 1; i<= h; i++) {
			for(int j=1; j<=w; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}
}

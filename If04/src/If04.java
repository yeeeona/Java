import java.util.Scanner;

public class If04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수입력: ");
		int n = sc.nextInt();
		
		if(n%3==0 && n%4 ==0) {
			System.out.println(n + "은 3의 배수이면서 4의 배수입니다.");	
		} else if(n%3==0) {
			System.out.println(n + "은 3의 배수입니다.");
		} else if(n%4==0) {
			System.out.println(n + "은 4의 배수입니다.");
		} else {
			System.out.println(n + "은 3의 배수도 4의 배수도 아닙니다.");
		}
		
		sc.close();
	}

}

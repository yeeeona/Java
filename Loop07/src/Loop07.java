
import java.util.Scanner;

public class Loop07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		
		System.out.print("실수를 입력하세요.: ");
		double n = sc.nextDouble();
		
		while(true) {			
			System.out.println("# 삼각 함수 계산 메뉴#");
			System.out.println("1 - sin 함수\n2 - con 함수\n3 - tan 함수\n0 - 종료");
			System.out.println("3가지의 삼각함수 중에서 선택하세요.(1-3, 0: 종료)");
			int menu = sc.nextInt();
			
			if(menu == 1) {
				System.out.println(Math.sin(n));
				break;
			} else if (menu == 2) {
				System.out.println(Math.cos(n));
				break;
			} else if (menu == 3) {
				System.out.println(Math.tan(n));
				break;
			} else if (menu == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("번호를 다시 입력해주세요.");
				continue;
			}
			
		}
		sc.close();
		
	}
}

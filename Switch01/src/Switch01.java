import java.util.Scanner;

/*
 * switch~case문
 * - 조건에는 반드시 정수, 문자열만 사용 가능, 실수 불가능
 * - 정수 또는 문자열이 조건이고, 
 */

public class Switch01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("메뉴 선택(1-4): ");
		int menu = sc.nextInt();
		
		switch(menu) {
		case 1:
			System.out.println("파일 열기");
			break;
		case 2:
			System.out.println("파일 읽기");
			break;
		case 3:
			System.out.println("파일 쓰기");
			break;
		case 4:
			System.out.println("파일 닫기");
			break;
		default:
			System.out.println("다시 입력");
			break;
		}
		sc.close();
	}	
}

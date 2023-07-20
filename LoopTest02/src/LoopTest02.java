// 문제2) 0(가위), 1(바위), 2(보)의 숫자를 입력하여, 가위, 바위, 보 게임을 작성하시오.
// 컴퓨터하거 게임을 하고, 컴퓨터는 0, 1, 2의 난수를 생성하여 내가 입력한 숫자와 비교를 한다.

import java.util.Scanner;

public class LoopTest02 { 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 2번 문제
		// 사용자 입력
		System.out.print("0(가위), 1(바위), 2(보) 입력: ");
		int n = sc.nextInt();
		
		
		// 컴퓨터 난수 셍성
		int rn = (int)(Math.random() * 3);
		
		// 내 버전 ------------------------------------
		// 결과
		if((n == 0 && rn == 2) || (n == 1 && n == 0) || (n == 2 && rn == 1)) {
			System.out.println("당신이 승리하였습니다.");
		} else if((n == 0 && rn == 1) || (n == 1 && n == 2) || (n == 2 && rn == 0)){
			System.out.println("당신이 패배하였습니다.");
		} else if(n == rn) {
			System.out.println("무승부입니다.");
		} else {
			System.out.println("잘못입력하셨습니다.");
		}
		
		// 강사님 -------------------------------------
		// 계산식
		/*
		int result = n - rn;
		
		// 결과
		switch(result) {
		case 1: case -2:
			System.out.println("당신이 이겼습니다");
			break;
		case 2: case -1:
			System.out.println("당신이 졌습니다");
			break;
		case 0:
			System.out.println("비겼습니다.");
			
		}
		System.out.printf("사용자: %d, 컴퓨터: %d\n", n, rn);
		*/
		
		
		
		sc.close();
	}

}

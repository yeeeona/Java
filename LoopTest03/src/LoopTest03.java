// 문제3) 가위 바위 보 게임을 계속할 것은지를 물어보고, 게임을 마친 후에는 승패의 수를 출력하도록 하시오.

import java.util.Scanner;

public class LoopTest03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char anwer;
		int n, tot = 0, win = 0, lose = 0, same = 0;
		double ratio = 0.0;
		
		
		do {
			// 사용자가 0, 1, 2 이외의 값을 입력하지 못하게
			do {
				System.out.print("0(가위), 1(바위), 2(보) 입력: ");
				n = sc.nextInt();				
			} while(!(n>=0 && n<=2));
			// 사용자 입력
			
			
			// 컴퓨터 난수 셍성
			int rn = (int)(Math.random() * 3);
			int result = ((n - rn)+3) % 3;
			
			// 승리 여부
			switch(result) {
			case 1:
				System.out.println("당신이 이겼습니다");
				++ win;
				break;
			case 2:
				System.out.println("당신이 졌습니다");
				++lose;
				break;
			case 0:
				System.out.println("비겼습니다.");
				++same;
				break;
				
			}
			System.out.printf("사용자: %d, 컴퓨터: %d\n", n, rn);
			
			// 게임 유무 확인
			System.out.print("게임을 다시 하시겠습니까? (y/n): ");
			anwer = sc.next().charAt(0);
			
			
		} while (anwer == 'y');
		
		// 승리 확률 계산
		ratio = ((double)win/(double)tot) * 100;
		
		System.out.println("가위 바위 보 게임을 종료합니다.");
		System.out.printf("당신의 전적은 %d전 %d승 %d패 %d무 입니다\n", tot, win, lose, same);
		System.out.printf("당신의 승리 확률은 %.2f\n", ratio);
		sc.close();
		
	}
}

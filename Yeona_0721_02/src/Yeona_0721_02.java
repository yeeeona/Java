/* 
 * 과제2) ArrayTest02 프로젝트에서 사용자의 로또를 2차원 배열로 생성하여, 로또 당첨 여부를 출력하는 프로그램을 완성하시오.
 * 사용자의 로또 구매수를 입력하면, 로또 2차원 배열을 생성한다.
 * ex) 구매수를 5라고 입력하면, 5행 6열의 2차원 배열이 생성된디.
 * 2. 컴퓨터는 로또번호는 1차원 배열로 생성한다.
 * 3. 사용자의 로또 번호와 컴퓨터의 로또번호를 비교하여 당첨 여부를 판단하도록 하시오.
 * ex) 로또 사이트를 참고하여, 등수를 결정하시오.
 */

import java.util.Scanner;

public class Yeona_0721_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 로또 개수 입력 받기
		System.out.print("구매한 로또 개수를 입력하세요.: ");
		int n = sc.nextInt();
		
		// 로또 번호 생성 및 추가
		int[][] lotto = new int[n][6];
		
		for(int i=0; i<lotto.length; i++) {
			for(int j=0; j<lotto[i].length; j++) {
				lotto[i][j] = (int)(Math.random() * 45)+1;
				for(int k=0;k<j; k++) {
					if(lotto[i][j] == lotto[i][k]) {
						j--;
						break;
					}				
				}
			}
		}
		// 오름 차순 정렬
		for(int i=0; i<lotto.length; i++) {
			for(int j=0; j<lotto[i].length-1; j++) {
				for(int k=j+1; k<lotto[i].length; k++) {
					if(lotto[i][j] > lotto[i][k]) {
						int t = lotto[i][j];
						lotto[i][j] = lotto[i][k];
						lotto[i][k] = t;
					}
				}
			}
		}
		
		// 내 로또 출력
		for(int i=0; i<lotto.length; i++) {
			System.out.print("로또 번호 " + (i+1) + ": " );
			for(int j=0; j<lotto[i].length; j++) {
				System.out.print(lotto[i][j] + " ");				
			}
			System.out.println();
		}
		
		// 로또 당첨 번호
		int [] winNum = new int [] {4, 8, 17, 30, 40, 43};
		
		System.out.print("1077회 로또 당첨번호: ");
		for(int i=0; i<winNum.length; i++) {
			System.out.printf(" " + winNum[i]);
		}
		System.out.println();
		
		// 당첨 결과 확인
		for(int i=0; i<lotto.length; i++) {
			int cnt = 0;
			for(int j=0; j<lotto[i].length; j++) {
				for(int k=0; k<winNum.length; k++) {
					if (lotto[i][j] == winNum[k]) {
						++cnt;
						break;					
					}
				}
			}
			switch(cnt) {
			case 0: case 1: case 2: 
				System.out.println("로또" + (i + 1) + "번째 " + cnt + "개 꽝입니다.");
				break;
			case 3:
				System.out.println("로또" + (i + 1) + "번째 " + cnt + "개 축하합니다! 5등입니다.");
				break;
			case 4:
				System.out.println("로또" + (i + 1) + "번째는 " + cnt + "개 축하합니다! 4등입니다.");
				break;
			case 5:
				System.out.println("로또" + (i + 1) + "번째는 " + cnt + "개 축하합니다! 3등입니다.");
				break;
			case 6:
				System.out.println("로또" + (i + 1) + "번째는 " + cnt + "개 축하합니다! 1등입니다.");
				break;
			}
		}
	
		
		sc.close();
	}
}

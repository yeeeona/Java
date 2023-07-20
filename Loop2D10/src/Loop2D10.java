// 1) 구구단을 가로로 출력하시오.

public class Loop2D10 {
	public static void main(String[] args) {
		
		// 1번
		/*
		for(int i =1; i<=9; i++) {
			for(int j=2; j<=9;j++) {
				 System.out.printf("%d*%d=%d ", j, i, j*i);
			}
			System.out.println();
		}
		*/
		
		// 2번 - if문
		for(int i=1; i<=9; i++) {
			for(int j=2; j<=9; j++) {
				if(j*i <10) {
					System.out.print(j + "*" + i + "=" + (j*i) + "  ");
				} else {
					System.out.print(j + "*" + i + "=" + (j*i) + " ");
				}
			}
			System.out.println();
		}
		
		
	}
}

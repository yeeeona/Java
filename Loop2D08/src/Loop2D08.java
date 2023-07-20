

public class Loop2D08 {
	public static void main(String[] args) {
		
		// 1번 - for문
		/*
		for(int i=2; i<=9; i++) {
			System.out.printf("-----%d단---n", i);
			for(int j=1; j<=9; j++) {
				System.out.printf("%d * %d = %d\n", i, j, i*j);
			}
			System.out.println();
		}
		*/
		
		// 2번 - while문
		
		int i =2, j;
		while(i <= 9) {
			j = 1;
			while(j <= 9) {
				System.out.printf("%d * %d = %d\n", i, j, i*j);
				j++;
			}
			i++;
			System.out.println("@");
		}
		
	}
}

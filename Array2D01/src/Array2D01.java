// 2차원 배열 - 행과 열을 구조로 가지는 배열
public class Array2D01 {
	public static void main(String[] args) {
		// 2차원 배열 생성
		// 1번 방법.
		/*
		int[][] a; // int형의 2차원 배열을 참조하는 참조변수
		a = new int[3][];
		a[0] = new int[4]; // 0번 행의 열의 개수
		a[1] = new int[4]; // 1번 행의 열의 개수
		a[2] = new int[4]; // 2번 행의 열의 개수
		*/
		
		// 2번 방법 - 선언과 동시에 본체를 생성
		int[][] a = new int[3][4];
		/*
		a[0][0] = 10;
		a[2][3] = 50;
		a[3][4] = 70;
		
		System.out.println(a[0][0]);
		System.out.println(a[2][3]);
		*/
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.println();
			}
		}
		
	}
}

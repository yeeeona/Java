
public class ForIn02 {
	public static void main(String[] args) {
		int[][] a = new int[][] {
			{10, 20, 30, 40},
			{50, 60, 70, 80},
			{90, 11, 12, 13},
		};
		
		// 1번 - 기본 for
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("-----------");
		
		// 2번 - for-in문
	      for(int[] i : a) {
	         for(int j : i) {
	            System.out.print(j + " ");
	         }
	         System.out.println();
	      }
	      System.out.println();
	}
}

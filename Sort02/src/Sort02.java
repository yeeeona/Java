
public class Sort02 {
	public static void main(String[] args) {
		// int [] a = {30, 70, 20, 10, 50};
		int [] a = {30, 70, 20, 10, 50, 99, 88, 66, 55, 33, 77, 22};
		
		// 버블 정렬 전
		System.out.print(" 선택 정렬 전: ");
		for(int i=0; i<a.length; i++) {
			System.out.printf("%3d", a[i]);
		}
		System.out.println();	
		
		for(int i=0; i<a.length-1; i++) {
			boolean isChecked = false; // flag
			for(int j=0; j<a.length-1-i; j++) {
				if(a[j] > a[j+1]) {
					int t = a[j];
					a[j] = a[j+1];
					a[j+1] = t;
					isChecked = true;
				}
			}
			if(!isChecked) {
				break;
			}
			System.out.printf("%2d번 회전 후:", i);
			for(int j=0; j<a.length; j++) {
				System.out.printf("%3d", a[j]);
			}
			System.out.println();
		}
		
		// 버블 정렬 후
		for(int i=0; i<a.length; i++) {
			System.out.printf("%3d", a[i]);
		}
		System.out.println();
	}
}

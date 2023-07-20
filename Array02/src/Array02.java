
// 1차원 배열: 1개의 행에 연속적인 값을 다루도록 하는 배열

public class Array02 {
	public static void main(String[] args) {
		// 1차원 배열 생성
		// 1번
		/*
		int[] a; // 참조변수 선언: 배열의 참조변수 -> int형의 1차원 배열을 참조하는 참조변수 a
		a = new int[5]; // 참조변수 a가 int형 배열 본체를 참조함.
		 */	
		
		// 2번
		int[] a = new int[5];
		
		// int형의 배열은 0으로 초기화가 됨.
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		System.out.println();
		
		// 값을 대입
		a[1] = 10;
		a[3] = 30;
		
		// 반복문응 통한 일괄 처리
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		
		
	}

}

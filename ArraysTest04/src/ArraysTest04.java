import java.util.Arrays;

public class ArraysTest04 {
	public static void main(String[] args) {
		int[] x = new int[10];
		
		System.out.println(Arrays.toString(x));
		
		// 7. Arrays.fill(): 배열의 값을 특정값으로 채우는 메소드
		Arrays.fill(x, 3); // 전체를 3으로 채울 때
		System.out.println(Arrays.toString(x));
		
		Arrays.fill(x, 2, 5, 10); // 2번에서 5번 앞까지 10으로 채움
		System.out.println(Arrays.toString(x));
		
		// 8. Arrays.binarySearch(): 배열에서 값에 대한 인덱스를 검색하는 메소드
		// 정렬한 후에 검색해야 함.
		// int형
		int[] a = {98, 87, 58, 68, 72};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.binarySearch(a, 99));

		String[] s = {"이장현", "유길채", "남연준", "경은애", "량음"};
		System.out.println(Arrays.binarySearch(s, "경은애"));
	}

}

import java.util.Arrays;
import java.util.Collections;

public class ArraysTest03 {
	public static void main(String[] args) {
		int[] a1 = { 87, 92, 68, 57, 85};
		
		// Arrays.sort(): 배열을 오름차순으로 정렬하여 저장
		Arrays.sort(a1);
		System.out.println(Arrays.toString(a1));
		
		// 내림차순 - 배열이 Wrapper 클래스이어야 함.
		Integer[] a2 = {87, 92, 68, 57, 85};
		Arrays.sort(a2, Collections.reverseOrder());
		System.out.println(Arrays.toString(a2));
		System.out.println("------");
		
		// 1-2. 문자열
		String[] s1 = {"이장현", "유길채", "남연준", "경은애", "량음"};
		// 오름차순
		Arrays.sort(a2);
		System.out.println(Arrays.toString(s1));
		
		

	}

}

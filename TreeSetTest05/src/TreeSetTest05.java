import java.util.SortedSet;
import java.util.TreeSet;

// subSet() 메소드를 활용한 셋 생성
public class TreeSetTest05 {
	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<String>();
		
		String[] words = {
				"abc", "alien", "bat", "car", "Car", "disco", "dance", "dZZZZ", "dzzzz",
				"elephant", "elevator", "fan", "flower", "d", "a",
				"바다", "하늘", "나무", "강", "?",
		};
		
		// 문자열 오룸차순 : 기호 > 대문자 > 소문자 > 한글
		for(String s : words) {
			set.add(s);
		}
		System.out.println(set);
		
		// a부터 d앞까지(d는 미포함)
		SortedSet<String> set2 = set.subSet("a", "d");
		System.out.println(set2);
		
		// a부터 d까지 (d 포함)
		SortedSet<String> set3 = set.subSet("a", "e");
		// SortedSet<String> set3 = set.subSet("a", "dzzzzzzzzzzzz");
		System.out.println(set3);
		
		// a부터 d까지 (d포함)
		SortedSet<String> set4 = set.subSet("a", true, "d", true);
		System.out.println(set4);
		
		// 4. 한글일 경우 - 완성된 글자 단위로 인식함, 자음 단위 또는 모음 단위로는 인식하지 않는다.
		// SortedSet<String> set5 = set.subSet("ㄱ", "ㄹ"); // 잘못된 방법
		SortedSet<String> set5 = set.subSet("가", "라"); // 옳은 방법
		System.out.println(set5);
		

	}

}

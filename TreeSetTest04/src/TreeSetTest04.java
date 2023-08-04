import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;


public class TreeSetTest04 {

	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<>();
		
		// 데이터 추가
		set.add(87); set.add(98); set.add(75); set.add(95); set.add(80);
		System.out.println("오름차순 정렬: " + set);
		
		// 내림차순으로 정렬하여 저장
		NavigableSet<Integer> set2 = set.descendingSet();
		System.out.println("내림차순 정렬: " + set2);
		
		// 1. 특정 값보다 작은 값을 가진 부분셋을 생성, 적힌 값을 포함하지 않음.
		SortedSet<Integer> set3 = set.headSet(87);
		System.out.println(set3);
		
		// 2. 특정 값보다 큰 값을 가진 부분셋을 생성
		SortedSet<Integer> set4 = set.tailSet(87);
		System.out.println(set4);
		
		// 3. 특정 값보다 작은 값을 가진 부분셋을 생성, 적힌 값을 포함
		// headSet(): 특정값보다 작은 값을 가지는 부분셋을 만드는 메소드
		// 옵션에 아무것도 적지 않으면 false, 기본값 -> 특정값을 포함하지 않음
		// 옵션에 true로 적으면 -> 특정값 미포함. 
		SortedSet<Integer> set5 = set.headSet(87, true);
		System.out.println(set5);

	}

}

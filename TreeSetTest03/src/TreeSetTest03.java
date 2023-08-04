import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest03 {
	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<>();
		
		// 데이터 추가
		set.add(87); set.add(98); set.add(75); set.add(95); set.add(80);
		System.out.println(set);
		
		System.out.println("가장 낮은 점수: " + set.first());
		System.out.println("가장 높은 점수: " + set.last());
		
		System.out.println("95점 바로 아래 점수: " + set.lower(95));
		System.out.println("95점 바로 위 점수: " + set.higher(95));
		
		System.out.println("95점이거나 바로 아래 점수: " + set.floor(90));
		System.out.println("95점이거나 바로 위 점수: " + set.ceiling(90));
		
		// 출력- 확장 for문
		for(int i : set) {
			System.out.println(i);
		}
		System.out.println("------");
		
		// 출력 2
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("-------");
		
		// 출력 3
		while(!set.isEmpty()) {
			//System.out.println(set.pollFirst()); // 오름차순
			System.out.println(set.pollLast()); // 내림차순
		}
		System.out.println("-----");
		
		System.out.println(set);

	}

}

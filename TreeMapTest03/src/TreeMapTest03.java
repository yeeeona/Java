import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapTest03 {
	public static void main(String[] args) {
		// 키: 점수, 값: 학생이름
		TreeMap<Integer, String> map = new TreeMap<>();
		
		// 데이터 추가 - 키를 기준으로 오름차순 정렬
		map.put(87, "이익준");
		map.put(98, "김준완");
		map.put(75, "채송화");
		map.put(95, "양석형");
		map.put(80, "안정원");
		System.out.println(map);
		
		Entry<Integer, String> entry = map.firstEntry();
		System.out.println("최저점: " + entry.getKey() + "(" + entry.getValue() + ")");
		entry = map.lastEntry();
		System.out.println("최고점: " + entry.getKey() + "(" + entry.getValue() + ")");
		
		// 바로 아래, 위 점수
		entry = map.lowerEntry(95);
		System.out.println("95점 바로 아래 점수: " + entry.getKey() + "(" + entry.getValue() + ")");
		entry = map.higherEntry(95);
		System.out.println("95점 바로 위의 점수: " + entry.getKey() + "(" + entry.getValue() + ")");
		
		// 바로 아래, 위 점수 -> 지정한 값을 포함함.
		entry = map.floorEntry(87);
		System.out.println("87점이거나 바로 아래 점수: " + entry.getKey() + "(" + entry.getValue() + ")");
		entry = map.ceilingEntry(95);
		System.out.println("87점이거나 바로 위의 점수: " + entry.getKey() + "(" + entry.getValue() + ")");
		
		// 출력 - isEmpty()
		// pollFirstEntry(): 첫번째 데이터부터 꺼내고, 삭제함
		
		
	}
}

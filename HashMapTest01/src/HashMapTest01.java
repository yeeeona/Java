
/*
 < Map >
 1. 데이터가 키와 값의 쌍으로 구성됨.
 2. 맵은 순서가 없다.
 3. 키는 중복을 허용하지 않음. 값은 중복을 허용함.
 4. 인터페이스, 구현제: HashMap, TreeMap
 5. Hashtable: HashMap의 구버전, 쓰레드의 동기화 부분이 있어서 성능 저하.
 -> HashMap은 쓰레드의 동기화 부분을 제거하여 성능 개선
 
 < HashMap >
 1. 해싱 기법으로 데이터를 저장하는 Map
 2. Map 인터페이스를 구현하고 있음.
 
 */
import java.util.HashMap;
public class HashMapTest01 {
	public static void main(String[] args) {
		// 키: 학번, 값: 이름
		HashMap<Integer, String> map = new HashMap<>();
		
		// 데이터 추가
		map.put(123456, "이익준");
		map.put(112233, "김준완");
		map.put(223344, "채송화");
		map.put(556677, "양석형");
		map.put(987654, "안정원");
		System.out.println(map);
		System.out.println("크기: " + map.size());
		
		// 중복 키의 삽입 - 중복 키를 허용 불가, 나중에 추가한 값으로 변경
		// -> 앱에서 데이터를 변경하는 작업
		map.put(223344, "장겨울");
		System.out.println("크기: " + map.size());
		// 중복 값의 삽입
		map.put(114477, "김준완");
		System.out.println(map);
		System.out.println("크기: " + map.size());
		
		// 데이터 삭제
		map.remove(556677);
		System.out.println(map);
		System.out.println("크기: " + map.size());
		
		map.remove("안정원");
		System.out.println(map);
		System.out.println("크기: " + map.size());
		

	}

}


// TreeMap: Tree 구조로 저장하는 Map
//  - 키를 기준으로 오름차순으로 정렬
import java.util.TreeMap;
public class TreeMapTest01 {
	public static void main(String[] args) {
		// 키: 사번(Integer), 값: 사원이름(String)
		TreeMap<Integer, String> map = new TreeMap<>();
		
		// 데이터 추가
		map.put(555555, "안정원");
		map.put(333333, "채송화");
		map.put(111111, "이익준");
		map.put(444444, "양석형");
		map.put(222222, "김준완");
		System.out.println(map);
		System.out.println("크기: " + map.size());
		
		// 중복 키 확인
		map.put(444444, "장겨울");
		System.out.println(map);
		System.out.println("크기: " + map.size());
		
	}

}

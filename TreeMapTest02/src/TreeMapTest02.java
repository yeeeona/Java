
/*
 문제2) 아래의 조건에 부합하는 TreeMap인 map을 생성하고, 활용하시오.
 1. 키는 학생이름, 값은 점수를 저장하는 map을 생성하시오.
 2. 맴에 학생 데이터 5개를 추가하시오.
 3/ map에 대해 중복 키와 값에 대한 검증을 하시오.
 4. map의 데이터를 3가지 방법으로 출력하시오.
 
 */

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapTest02 {
	public static void main(String[] args) {
		// 1. map 생성
		TreeMap<String, Integer> map = new TreeMap<>();
		
		// 2. 데이터 추가
		map.put("이익준", 11);
		map.put("채송화", 22);
		map.put("안정원", 33);
		map.put("장겨울", 44);
		map.put("김준완", 55);
		System.out.println(map);
		System.out.println("크기: " + map.size());
		
		// 3. 중복 키 확인 -> 허용하지않음
		map.put("이익준", 66);
		System.out.println(map);
		System.out.println("크기: " + map.size());
		
		// 4. 중복 값 확인 -> 허용함
		map.put("추민하", 11);
		System.out.println(map);
		System.out.println("크기: " + map.size());
		
		// 5-1. 출력 1
		Set<String> keySet = map.keySet();
		Iterator<String> it = keySet.iterator();
		while(it.hasNext()) {
			String name = it.next();
			int score = map.get(name);
			System.out.println("학생이름: " + name + ", 점수: " + score);
		}
		System.out.println("-----");
		
		/// 5-2. 출력2 entrySet, Iterator
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Entry<String, Integer>> it2 = entrySet.iterator();
		while(it2.hasNext()) {
			Entry<String, Integer> e = it2.next();
			String s = e.getKey();
			int score = e.getValue();
			System.out.println("학생정보 : " + s + ", 점수 : " + score);
		}
		System.out.println("----------");
		// 5-3. 출력3 entrySet, 확장 for문
		Set<Entry<String, Integer>> entrySet2 = map.entrySet();
		for(Entry<String, Integer> e : entrySet2) {
			String s =e.getKey();
			int score = e.getValue();
			System.out.println("학생정보 : " + s + ", 점수 : " + score);
		}
		System.out.println("-------------");
		
		
	}
}

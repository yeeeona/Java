
/*
 문제1) 아래의 조건을 만족하는 HashSet인 set을 생성하고, 활용하시오
 1. 셋에 names 배열의 값을 추가하고, 확인하시오.
 2. 중복 데이터를 삽입하여, 허용 여부를 확인하시오. ex)채송화
 3. 중복되지 않은 데이터를 삽입하여, 허용 여부를 확인하시오. ex) 장겨울
 4. 김준완 데이터를 삭제하고, 확인하시오.
 5. 2가지 출력 방법으로 데이터를 출력하시오. (확장 for문, Iterator 사용)
 */
import java.util.HashSet;
import java.util.Iterator;
public class HashSetTest02 {
	public static void main(String[] args) {
		String[] names = {"이익준", "김준완", "채송화", "양석형", "안정원"};
		
		// 1. set 생성
		HashSet<String> set = new HashSet<String>();
		
		// 2. 데이터 삽입
		for(String s: names) {
			set.add(s);
		}
		System.out.println(set);
		System.out.println("크기: " + set.size());
		
		// 3. 데이터 삽입 - 중복 데이터
		
		set.add("채송화");
		System.out.println(set);
		System.out.println("크기: " + set.size());
		
		
		// 4. 데이터 삽입 - 중복되지 않은 데이터
		set.add("장겨울");
		System.out.println(set);
		System.out.println("크기: " + set.size());
		
		// 5-1. 데이터 삭제 - 존재하는 데이터
		set.remove("김준완");
		System.out.println(set);
		System.out.println("크기: " + set.size());
		
		// 5-2. 데이터 삭제 - 존재하지 않는 데이터
		set.remove("추민하");
		System.out.println(set);
		System.out.println("크기: " + set.size());
		
		// 6-1. 출력1 - 확장 for문
		for(String s: set) {
			System.out.println(s);
		}
		
		// 출력 2 - Iterator와 while 문 사용
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String x = it.next();
			System.out.println(x); // = System.out.println(it.next());
	    }
}

}

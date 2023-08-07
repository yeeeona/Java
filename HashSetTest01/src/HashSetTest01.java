import java.util.HashSet;
import java.util.Iterator;

/*
2. Set 계열
- HashSet, TreeSet ...
- Set 인터페이스를 구현함.
- 특징: 순서가 없고, 중복 데이터를 허용하지 않음.
- 한 종류의 데이터만 담는 큰 바구니, 수학에서는 집합
- 인덱스가 없으므로, 기본 for문을 사용할 수 없음.

< Hashing >
- 키(해시 함수)를 통해 해싱 테이블(배열)을 검색하는 데이터 구조
- 검색하는데 최적화된 데이터 구조

- HashSet: 해싱 기법이 적용된 셋

*/
public class HashSetTest01 {
	public static void main(String[] args) {
		// 셋의 생성
		HashSet<Integer> set = new HashSet<Integer>();
		
		// 데이터 추가
		set.add(66); set.add(75); set.add(57); set.add(96); set.add(45);
		System.out.println(set.toString());
		System.out.println("크기: " + set.size());
		
		// 중복 데이터의 허용 불가
		set.add(57);
		System.out.println(set);
		System.out.println("크기: " + set.size());
		
		// 중복이 아닌 데이터 추가는 허용함 -> 순서가 없다.
		set.add(83);
		System.out.println(set);
		System.out.println("크기: " + set.size());
		
		// 데이터 삭제 - 존재하는 데이터
		set.remove(96);
		System.out.println(set);
		System.out.println("크기: " + set.size());
		
		// 데이터 삭제 - 존재하지 않은 데이터 -> 에러가 발생하지 않음(예외처리가 되어있음) -> 안정적으로 사용 가능
		set.remove(90);
		System.out.println(set);
		System.out.println("크기: " + set.size());
		System.out.println("-----");
		
		// 출력1 - 확장 for문 사용, 기본 for문 사용 불가(인덱스가 없으므로)
		for(int i : set) {
			System.out.println(i);
		}
		System.out.println("-----");
		
		// 출력2 - Iterator 사용
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) { 
			int n = it.next();
			System.out.println(n);
		}
		
		
	}

}

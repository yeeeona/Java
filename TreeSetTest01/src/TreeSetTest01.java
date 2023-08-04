
// TreeSet: Tree 데이터 저자 구조를 갖는 셋
// Tree: 데이터를 저장할 때 루트 노드를 기준으로 작은 값은 왼쪽으로, 큰 값은 오른쪽으로
// - 데이터가 저장되는 모양을 따서 Tree라고 이름을 붙임

import java.util.TreeSet;

public class TreeSetTest01 {
	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<>();
		
		// 데이터 추가 - 순서가 없다. 오름차순으로 정렬되어 출력됨.
		set.add(82);
		set.add(63);
		set.add(58);
		set.add(97);
		set.add(76);
		System.out.println(set);
		System.out.println("크기: " + set.size());
		
		// 중복 데이터 허용 여부 
		set.add(97);
		System.out.println(set);
		System.out.println("크기: " + set.size());
		
		// 중복되지 않은 데이터 추가
		set.add(85);
		System.out.println(set);
		System.out.println("크기: " + set.size());
		
		// 존재하는 데이터 삭제
		set.remove(76);
		System.out.println(set);
		System.out.println("크기: " + set.size());
		
		// 존재하지 않는 데이터 삭제
		set.remove(90);
		System.out.println(set);
		System.out.println("크기: " + set.size());
		
		// 모든 데이터 삭제
		set.clear();
		System.out.println(set);
		System.out.println("크기: " + set.size());
		
		
		

	}

}

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest02 {

	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<>();
		
		// 데이터 추가 
		String[] names = {"이익준", "김준완", "채송화", "장겨울", "안정원"};
		for(String s : names) {
			set.add(s);
		}
		System.out.println(set);
		System.out.println("크기: " + set.size());
		
		// 중복되지 않는 데이터 추가 - 하용
		set.add("도재학");
		System.out.println(set);
		System.out.println("크기: " + set.size());
		
		// 중복 데이터 추가 - 허용하지 않음
		set.add("안정원");
		System.out.println(set);
		System.out.println("크기: " + set.size());
		
		// 데이터 삭제 - 1개
		set.remove("김준완");
		System.out.println(set);
		System.out.println("크기: " + set.size());
		
		// 모든 데이터 삭제
		/*
		set.clear();
		System.out.println(set);
		System.out.println("크기: " + set.size());
		*/
		
		// 출력 1 - 확장 for문
		for (String m: set) {
			System.out.println(m);
		}
		System.out.println("-------");
		
		// 출력 2 - Iterator
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}
		
		
		

	}

}

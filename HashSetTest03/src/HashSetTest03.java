import java.util.HashSet;

public class HashSetTest03 {
	public static void main(String[] args) {
		String[] names = {"이익준", "김준완", "채송화", "양석형", "안정원"};
		
		HashSet<String> set = new HashSet<>();
		HashSet<String> set2 = new HashSet<>();
		HashSet<String> set3 = new HashSet<>();
		
		for(String s : names) {
			set.add(s);
		}
		System.out.println(set);
		
		set2.add("이익준"); set2.add("양석형"); set2.add("장겨울");
		System.out.println(set2);
	
		set3.add("채송화"); set3.add("양석형"); set3.add("안정원");
		System.out.println(set2);
		
	
		
		// 데이터의 포함 여부 - 데이터 1개
		System.out.println(set.contains("채송화"));
		System.out.println(set.contains("장겨울"));
		
		// 데이터의 포함 여부 - 셋의 전체 데이터 
		System.out.println(set.containsAll(set2));
		System.out.println(set.containsAll(set3));
		System.out.println("-----");
		
		// 데이터 추가 - 셋의 모든 데이터
		set.addAll(set2);
		System.out.println(set);
		System.out.println("크기: " + set.size());
		
		// 데이터 삭제 - 1개
		set.remove("양석형");
		System.out.println(set);
		System.out.println("크기: " + set.size());
		
		// 모든 데이터 삭제
		set.clear();
		System.out.println(set);
		System.out.println("크기: " + set.size());
		
	}
}

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// ArrayList와 LinkedList의 접근 속도 비교
public class LinkedListTest04 {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		LinkedList<Integer> ll = new LinkedList<Integer>();
		
		System.out.println("- 데이터 추가 -");
		add(al);
		add(ll);
		
		System.out.println("- 접근 시간 비교 -");
		System.out.println("ArrayList  시간: " + access(al) + "ms");
		System.out.println("LinkedList 시간: " + access(ll) + "ms");
		
	}
	
	// 데이터 추가
	public static void add(List<Integer> list) {
		for(int i=0; i<100000; i++) {
			list.add(i);
		}
	}
	
	// 접근 시간
	public static long access(List<Integer> list) {
		long sTime = System.currentTimeMillis();
		for(int i=0; i<list.size(); i++) {
			list.get(i);
		}
		long eTime = System.currentTimeMillis();
		return eTime - sTime;
	}

}

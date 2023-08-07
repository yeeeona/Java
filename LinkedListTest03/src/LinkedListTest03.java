import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// < ArrayList와 LinkedList의 성능 비교 >
// 1. ArrayList : 배열 구조,    접근속도(읽기) 빠름, 순차적인 추가/삭제가 빠름, 비순차적인 추가/삭제가 느림.
// 2. LinkedList: 노드 연결 구조, 접근속도(읽기) 느림, 순차적인 추가/삭제가 느림, 비순차적인 추가/삭제가 빠름.
public class LinkedListTest03 {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		LinkedList<Integer> ll = new LinkedList<Integer>();
		
		System.out.println("- 순차적인 추가 -");
		System.out.println("ArrayList  시간: " + add1(al) + "ms");
		System.out.println("LinkedList 시간: " + add1(ll) + "ms");
		
		System.out.println("- 비순차적인 추가 -");
		System.out.println("ArrayList  시간: " + add2(al) + "ms");
		System.out.println("LinkedList 시간: " + add2(ll) + "ms");
		
		System.out.println("- 비순차적인 삭제 - ");
		System.out.println("ArrayList  시간: " + delete1(al) + "ms");
		System.out.println("LinkedList 시간: " + delete1(ll) + "ms");
		
		System.out.println("- 순차적인 삭제 -");
		System.out.println("ArrayList  시간: " + delete2(al) + "ms");
		System.out.println("LinkedList 시간: " + delete2(ll) + "ms");
		
	}
	
	// 순차적인 추가
	public static long add1(List<Integer> list) {
		long sTime = System.currentTimeMillis(); // 1000분 1초
		for(int i=0; i<1000000; i++) {
			list.add(i);
		}
		long eTime = System.currentTimeMillis();
		return eTime - sTime;
	}
	
	// 비순차적인(중간) 추가
	public static long add2(List<Integer> list) {
		long sTime = System.currentTimeMillis(); // 1000분 1초
		for(int i=0; i<10000; i++) {
			list.add(500, i);
		}
		long eTime = System.currentTimeMillis();
		return eTime - sTime;
	}
	
	// 비순차적인(중간) 삭제
	public static long delete1(List<Integer> list) {
		long sTime = System.currentTimeMillis(); // 1000분 1초
		for(int i=0; i<10000; i++) {
			list.remove(i);
		}
		long eTime = System.currentTimeMillis();
		return eTime - sTime;
	}
	
	// 순차적인 삭제
	public static long delete2(List<Integer> list) {
		long sTime = System.currentTimeMillis(); // 1000분 1초
		for(int i=list.size()-1; i>=0; i--) {
			list.remove(i);
		}
		long eTime = System.currentTimeMillis();
		return eTime - sTime;
	}

}

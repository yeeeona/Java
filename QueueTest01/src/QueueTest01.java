import java.util.LinkedList;
import java.util.Queue;

// Queue(큐)
// 1. 한 방향으로 데이터가 이동하는 파이프처럼 생긴 데이터의 저장 구조
// 2. offer: 데이터 삽입, poll: 데이터 꺼냄
// 3. 선입선출: FIFO(First In First Out)
public class QueueTest01 {
	public static void main(String[] args) {
		// 큐 생성
		Queue<Integer> q1 = new LinkedList<Integer>();
		
		// 데이터 삽입
		q1.offer(10);
		q1.offer(20);
		q1.offer(30);
		System.out.println(q1.toString());
		
		// 데이터를 꺼내서 삭제
		while(!q1.isEmpty()) {
			System.out.println(q1.poll());
		}
		System.out.println(q1);
		System.out.println("-----");
		
		Queue<String> q2 = new LinkedList<>();
		
		q2.offer("이익준");
		q2.offer("김준완");
		q2.offer("양석형");
		q2.offer("안정원");
		q2.offer("채송화");
		System.out.println(q2.toString());
		
		while(!q2.isEmpty()) { 
			System.out.println(q2.poll());
		}
		System.out.println(q2);
		
	}

}

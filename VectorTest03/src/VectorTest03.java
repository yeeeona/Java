import java.util.Vector;

public class VectorTest03 {
	public static void main(String[] args) {
		// 정수형을 저장하는 벡터 v 생성
		Vector<Integer> v = new Vector<>();
		int[] a = {10, 20, 30, 40, 50};
		
		System.out.println("--- 데이터 추가(삽입) ---");
		/*
		v.add(a[0]);
		v.add(a[1]);
		v.add(a[2]);
		v.add(a[3]);
		v.add(a[4]);
		*/
		for(int i=0; i<a.length; i++) {
			v.add(a[i]);
		}
		System.out.println(v.toString());
		
		System.out.println("--- 데이터 삭제(1개) ---");
		v.remove(2); // 2번 인덱스 삭제
		System.out.println(v.toString());
		
		System.out.println("--- 데이터 추가(중간, 비순차적) ---");
		// v.add(2, 60);
		v.insertElementAt(60, 2);
		System.out.println(v.toString());
		
		System.out.println("--- 데이터 변경 ---");
		v.set(3, 80);
		System.out.println(v.toString());
		
		System.out.println("--- 벡터의 개수 출력 ---");
		System.out.println(v.size());
		
		System.out.println("--- 첫번째 값 출력 ---");
		System.out.println(v.firstElement());
		System.out.println(v.get(0));
		
		System.out.println("--- 마지막 값 출력 ---");
		System.out.println(v.lastElement());
		System.out.println(v.get(v.size()-1));
		
		System.out.println("--- 인덱스의 해당하는 값을 출력 ---");
		System.out.println(v.get(3));
		System.out.println(v.elementAt(3));
		
		System.out.println("--- 지정한 값에 해당하는 인덱스 출력 ---");
		System.out.println(v.indexOf(60)); // 2
		
		// 중복된 값을 추가
		v.add(60);
		System.out.println(v.toString());
		
		System.out.println("--- 지정한 값에 해당하는 인덱스 출력(앞에서부터 찾음) ---");
		System.out.println(v.indexOf(60)); // 2 -> 앞에서 찾은 인덱스를 출력
		
		System.out.println("--- 지정한 값에 해당하는 인덱스 출력(뒤에서부터 찾음) ---");
		System.out.println(v.lastIndexOf(60)); // 5
		
		System.out.println("--- 지정한 값에 해당하는 인덱스 출력 (값이 없을 때) ---");
		System.out.println(v.indexOf(30)); // -1
		System.out.println(v.lastIndexOf(30)); // -1 
		
		v.add(20);
		System.out.println(v.toString());
		
		System.out.println("--- 지정한 위치부터 찾은 인덱스 출력 ---");
		System.out.println(v.indexOf(20, 2)); // 6
		
		System.out.println("-- 크기 확인 ---");
		System.out.println("크기: " + v.size());
		
		System.out.println("--- 벡터의 크기를 변경 ---");
		v.setSize(5);
		System.out.println(v.toString());
		System.out.println("크기: " + v.size());
		
		
		
	}
}

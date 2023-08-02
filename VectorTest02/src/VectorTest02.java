import java.util.Vector;

public class VectorTest02 {
	public static void main(String[] args) {
		// 벡터 생성
		// 일반화된(구체화된) 벡터
		// Vector<Integer> v = new Vector<Integer>();
		Vector<Integer> v = new Vector<>();
		
		// 데이터 추가
		v.add(new Integer(10)); // 박싱
		v.add(20); // 오토 박싱
		v.add(30); // 오토 박싱
		v.add(40); // 오토 박싱
		v.add(50); // 오토 박싱
		// v.add("이장현") // 에러
		
		// 출력
		System.out.println(v.get(0));
		System.out.println(v.get(1));
		System.out.println(v.get(2));
		System.out.println(v.get(3));
		System.out.println(v.get(4));
		System.out.println("------");
		
		// 출력 - 기본 for문 
		for(int i=0; i<v.size(); i++) {
			System.out.println(v.get(i));
		}
		System.out.println("------");
		
		// 출력 - 확장 for문
		for(int i : v) {
			System.out.println(i);
		}
		System.out.println("------");
		
		int sum = 0;
		for(int i : v) {
			sum += i;
		}
		System.out.println("합계: " + sum);
		
		// 벡터 확인
		System.out.println(v.toString());
		
		
		
		
	}

}

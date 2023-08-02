import java.util.Vector;
/*
 ✯✯✯✯✯
 < 컬렉션(Collection) > 컬렉션 프레임워크
 - 데이터를 효율적으로 다루기 위한 여러 가지 기능을 정의해 놓은 클래스를 통칭
 - 여러 가지 자료 구조의 내용을 클래스와 메소드로 만들어 놓은 프래임워크
 - 제너틱(Generic)이란 기법으로 만들어져 있음.
 
 1. List 계열
 - Vector, ArrayList ...
 - 가변적인 배열 구조
 - 특징: 순서가 있고, 중복 데이터를 허용
 
 2. Set 계열
 - HashSet, TreeSet ...
 - 특징: 순서가 없고, 중복 데이터를 허용하지 않음
 
 3. Map 계열
 - HashMa[, TreeMap ...
 - Properties
 - 특징: 하나의 데이터는 키(key)와 값(value)의 쌍으로 구성됨.
 - 키는 중복이 허용되지 않음. 값을 중복을 허용함
 
 */

// 벡터의 잘못 사용되는 예
public class VectorTest01 {
	public static void main(String[] args) {
		// 벡터 생성
		// 문제점 발생 - Raw 타입으로 생성
		// -> 데이터 타입을 정하지 않고, 여러가지 데이터 타입을 함께 사용하게 되면, 프로그램의 안정성을 떨어뜨리게 됨.
		Vector v = new Vector();
		
		// 데이터 삽입
		//
		v.add(10);
		v.add(3.14);
		v.add("이장현");
		v.add('A');
		v.add(true);
		
		// 출력 
		System.out.println(v.get(0));
		System.out.println(v.get(1));
		System.out.println(v.get(2));
		System.out.println(v.get(3));
		System.out.println(v.get(4));
		System.out.println("------");
		
		// 점수를 저장하는 벡터로 가정하게 되면
		/*
		int sum =0;
		for(int i=0; i<v.size(); i++) {
			sum += v.get(i);
		}
		*/
		
		// 출력 - 기본 for문
		for(int i=0; i<v.size(); i++) {
			System.out.println(v.get(i));
		}
		
		// 출력 - 확장 for문
		for(Object o : v) {
			System.out.println(o);
		}
		

	}

}

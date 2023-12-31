/*
 1. 문자열을 저장하는 벡터 v를 생성하시오
 2. 벡터 v에 배열 names의 값을 추가하고, 확인하시오.
 3. 이승엽 다음에 손흥민을 추가하고, 확인하시오.
 4. 박찬호를 삭제하고, 확인하시오.
 5. 김연경을 양효진으로 변경하고, 확인하시오.
 6. 벡터 v의 내용을 2가지 반복문을 사용하여 출력하시오. (기본 for문, 확장 for문)
 */

import java.util.Vector;

public class VectorTest07 {
	public static void main(String[] args) {
		String[] names = {"감연아", "박찬호", "이승엽", "김연경", "김성근"};
		
		// 1. 벡터 생성
		Vector<String> v = new Vector<>();
		
		// 2. 벡터에 배열 데이터 추가
		for(int i=0; i<names.length; i++) {
			v.add(names[i]);
		}
		System.out.println(v);
		/*
		v.add(names[0]);
		v.add(names[1]);
		v.add(names[2]);
		v.add(names[3]);
		v.add(names[4]);
		System.out.println(v);
		*/
		
		// 2. 중간에 추가
		v.add(3, "손흥민");
		System.out.println(v);
		
		// 4. 삭제
		// v.remove(1);
		v.remove("박진호");
		System.out.println(v);
		
		// 5. 변경
		v.set(3, "양효진");
		System.out.println(v);
		
		// 6-1. 출력 1 - 기본 for문
		
		// 6-2. 출력2 - 확장 for
	
		
	}

}

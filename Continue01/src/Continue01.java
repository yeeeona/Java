
// continue문을 만나게 되면, 해당 반복문의 끝지점으로 이동하게 되어
// continue문과 반복문의 끝지점의 사이의 내용을 실행할 수 없게 됨.
// 반복문 안에서 특정 조건을 만족했을 때 내용을 생략, 제거하고자 할 때 사용.

public class Continue01 {
	public static void main(String[] args) {
		
		for(int i=1; i<=100; i++) {
			if(i%5 == 0) {
				continue;
			}
			System.out.println(i);
			// continue를 만났을 때 이동하는 지점 - 반복문 안에서의 끝지점
		}
		
	
	
	}

}

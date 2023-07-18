// 무한 루프(Infinite Loop): 반복문을 끝내지 못하고, 무한히 반복하는 것 

public class InfiniteLoop01 {
	public static void main(String[] args) {
		
		// 무한 루프 - 프로그래머의 실수
		/*
		for(int i=1; i <= 10; i--) {
			System.out.println(i);
		}
		*/
		
		// 무한 루프 - 의도적인 무한 루프
		// 1번
		/*
		for(;true;) {
			System.out.println("*");
		}
		*/
		
		// 2번
		/*
		for(;;) {
			System.out.println("*");
		}
		*/
		
		// 3번
		/*
		while(true) {
			System.out.println("*");
		}
		*/
		
	}
}

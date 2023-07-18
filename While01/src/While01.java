
public class While01 {
	public static void main(String[] args) {
		
		// 1번 - 1부터 10까지 1씩 증가하는 값을 출력
		/*
		int i = 1; // 초기값
		while(i <= 10) { // 조건
			System.out.println(i + " Little Indian.");
			i++; // 증감값
		}
		*/
		
		// 2번 - 10부터 1까지 1씩 감소하는 값을 출력
		/*
		int i = 10;
		while(i >= 1) {
			System.out.println(i + " Little Indian.");
			i--;
		}
		*/
		
		// 3번 - 1부터 10까지 3씩 증가하는 값을 출력
		int i = 1;
		while(i <= 10) {
			System.out.println(i + " Little Indian.");
			i += 3;
		}
	}
	
}

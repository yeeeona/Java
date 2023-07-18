
public class DoWhile01 {
	public static void main(String[] args) {
		
		// 1번 - 1부터 10까지 1씩 증가하는 값을 출력
		/*
		int i = 1; // 초기값
		do {
			System.out.println(i + " :ittle Indian.");
			i++;
		} while(i <= 10);
		*/
		
		// 2번 - 10부터 1까지 1씩 감소하는 값을 출력
		/*
		int i = 10;
		do { 
			System.out.println(i + " :ittle Indian.");
			i--;
		} while(i >= 1);
		*/
		
		// 3번 - 10부터 1까지 2씩 감소하는 값을 출력
		int i = 10;
		do {
			System.out.println(i + " :ittle Indian.");
			i -= 2;
		} while(i>=1);
	}
}


public class For01 {
	public static void main(String[] args) {
		
		// 1번 - 1부터 10까지 1씩 증가하는 값을 출력
		// for(초기값;조건식;증감값)
		// 장점 : for문의 괄호 안에 초기값, 조건식, 증감값이 함께 있어서, 반복문의 회수를 파악하기가 용이하다.
		
		/*
		for(int i=1; i <= 10; i++) {
			System.out.println(i + " Little Indian");
		}
		*/
		
		// 2번 - 10부터 1까지 1씩 감소하는 값을 출력
		/*
		for(int i=10; i >=1; i--) {
			System.out.println(i + " Little Indian");
		}
		*/
		// 3번 - 1부터 100까지 3씩 증가하는 값 출력
		for(int i=1; i<=100; i+=3) {
			System.out.println(i + " Little Indian");
		}
 	}

}

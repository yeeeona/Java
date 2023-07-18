
public class DoWhile02 {
	public static void main(String[] args) {
		// while과 do~while문의 차이점
		// while문은 조건을 만족하지 않으면, 한 번도 실행되지 않을 수 있지만,
		// do~while문은 조건을 만족하지 않아도, 무조건 한 번은 실행함.
		// ex) do~while은 입력하면 설계에 사용.
		
		// 아래의 while문은 한번도 실행되지 않
		/*
		int i = 11;
		while(i <= 10) {
			System.out.println(i);
			i ++;
		}
		*/
		
		// 아래의 do~while문은 한번도 실행되지 않
		int i = 11;
		do {
			System.out.println(i);
			i ++;
		} while(i <= 10);
	}

}

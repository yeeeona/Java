
public class MathTest02 {

	public static void main(String[] args) {
		System.out.println(Math.max(10, 20)); // 둘 중에 큰 값
		System.out.println(Math.min(10, 20)); // 둘 중에 작은 값
		
		System.out.println("---------");
		System.out.println(Math.max(10, Math.min(30, 4))); // 메소드를 중첩해서 사용하면 여러 개의 값을 비교할 수 있음
		
		// round(): 메소드를 활용하는 방법
		// - 소수 첫째 자리에사 반올림하여 정수를 구함.
		System.out.println(Math.round(10.1));
		
		// 1. 소수 첫쩨 자리까지 구하는 방법(둘째 자리에서 반올림)
		double n = 60.456;
		double n2 = Math.round(n * 10)/10.0; // 605.6789 -> 606 / 10.0 -> 60.6
		System.out.println(n2);
		
		// 2. 소수 둘째 자리까지 구하는 방법(세째 자리에서 반올림)
		double n3 = Math.round(n * 100) / 100.0;
		System.out.println(n3);
		
		// 3. 소수 세째 자리까지 구하는 방법(네째 자리에서 반올림)
		double n4 = Math.round(n * 1000) / 1000.0;
		System.out.println(n4);
		
		
		
		
		
		

	}

}


/*
 1. numbers 배열을 사용하여 합게를 구하시오.
 2. 계산 과정에서 발생하는 예외를 발견하고, 예외를 처리하여 정상적으로 프로그램을 끝마치도록 하시오.
 
 */
public class ExceptionTest05 {
	public static void main(String[] args) {
		String[] numbers = {"95", "87", "66", "77", "83", "3.14"};
		int sum = 0;
		
		
		try {
			// 예외 발생: java.lang.NumberFormatException: For input string: "3.14"
			for(int i = 0; i<numbers.length; i++) {
				sum += Integer.parseInt(numbers[i]);
			}
		} catch(NumberFormatException e) {
			e.printStackTrace();
			//System.err.println("예외가 발생했습니다.");
		}
		System.out.println("합계: " + sum);
		System.out.println("예외를 처리하고 나서도 프로그램은 계속 실행되어야 합니다.");
		
	}

}

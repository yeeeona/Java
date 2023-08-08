
/*
 1. 에러
 - 에러(error): 컴파일 시에 발생하는 문제, 코드 상에 나타남
 - 예외(exception): 실행 시에 발생하는 문제, 코드 상에 나타나지 않음.
 
 2. 예외 처리
 - Exception Handling
 - 예외가 발생했을 때 실행을 멈추지 않고, 처리되도록 하는 것
 
 */
// 예외 발생
public class ExceptionTest01 {
	public static void main(String[] args) {
		int[] a= {95, 88, 75, 66, 82};
		int sum = 0;
		
		// 예외: java.lang.ArrayIndexOutOfBoundsException
		for(int i=0; i<=a.length; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
			sum += a[i];
		}
		
		System.out.println("합계: " + sum);
		
	}

}

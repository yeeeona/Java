
// 예외 처리
// - 예외를 처리하고, 정상적으로 프로그램을 완료하도록 하는 것.

/*
 < 예외를 처리하는 방법 >
 1. try ~ catch문 사용
 - try 블럭 안에는 예외가 발생하는 코드를 씀
 - catch 블럭 안에는 발생하는 예외에 대한 처리를 씀.
 - catch의 괄호 안에는 예외 발생 클래스를 씀.
  
 */
public class ExceptionTest02 {
	public static void main(String[] args) {
		int[] a = {97, 88, 77, 63, 82};
		int sum =0;
		
		try {
			for(int i=0; i<=a.length; i++) {
				sum += a[i];
				System.out.println("a[" + i + "] =" + a[i]);
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			// 예외 발생 메시지
			//e.printStackTrace();
			System.out.println(e.getMessage() + "번 인덱스에서 에러가 발생하였습니다.");
		}
		
		System.out.println("합계: " + sum);
		System.out.println("학생들의 점수를 처리하고 있습니다.");
	}
}


public class ExceptionTest06 {
	public static void main(String[] args) {
		
		try {
			// 예외 생성 방법
			Exception e = new Exception("고의로 예외를 발생시킴");
			throw e;
		} catch(Exception e) {
			System.out.println();
		}
	}
}

// 은행 계좌 클래스
// 클래스 본연의 개념을 설명하는 것이 아님
// -> 클래스가 왜 필요한지를 설명하는 예제.
// 문제점1 - 계좌의 정보를 변수명과 주석을 통해서 알 수 있다.
// 문제점2 - 한 사람의 계좌라면 하나로 묶어서 처리해야 하지만, 그렇지 않다.
// 문제점3 - 아무나 변수를 사용하여 입금과 출금이 가능하도록 되어있다.


// 은행 계좌 클래스 - 계좌명의, 계좌번호, 예금잔고
public class AccountTest01 {
	public static void main(String[] args) {
		// john의 계좌
		String johnAccountName = "Jogn";
		String johnAccountNo = "123456";
		int johnAccountBalance = 1000;
		
		// mary의 계좌
		String maryAccountName = "Mary";
		String maryAccountNo = "654321";
		int maryAccountBalance = 500;
		
		// 입금, 출금
		johnAccountBalance -= 200;
		maryAccountBalance += 100;
		
		System.out.println("* john의 계좌");
		System.out.println("	계좌명의: " + johnAccountName);
		System.out.println("	계좌번호: " + johnAccountNo);
		System.out.println("	예금잔고: " + johnAccountBalance);
		
		System.out.println("* mary의 계좌");
		System.out.println("	계좌명의: " + maryAccountName);
		System.out.println("	계좌번호: " + maryAccountNo);
		System.out.println("	예금잔고: " + maryAccountBalance);
		
	}
}
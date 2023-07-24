// 은행 게좌 클래스 - 계좌명의, 계좌번호, 예금잔고
// 해결1 - 변수명과 주석으로 계좌를 구분하던 문제를 해결.
// 해결2 - 한명의 계좌가 하나로 묶이도록 함.

// 문제점1
// 문제점2 - 아무나 참조변수를 사용하여 입금과 출금을 하고 있다.

class Account {
	// 멤버 변수 - 클래스의 멤버가 되는 변수
	String name;
	String no;
	int balance;
	
}


public class AccountTest02 {
	public static void main(String[] args) {
		// 인스턴스(intance) - 클래스를 사용하여 만든 실체
		Account john = new Account();
		Account mary = new Account();
		
		// john의 계좌에 대한 초기화
		john.name = "John";
		john.no = "123456";
		john.balance = 1000;
		
		// mary의 계좌에 대한 초기화
		mary.name = "mary";
		mary.no = "654321";
		mary.balance = 500;
		
		// 입금, 출금
		john.balance -= 200;
		mary.balance += 100;
		
		System.out.println("* john의 계좌");
		System.out.println("	계좌명의: " + john.name);
		System.out.println("	계좌번호: " + john.no);
		System.out.println("	예금잔고: " + john.balance);
		
		System.out.println("* mary의 계좌");
		System.out.println("	계좌명의: " + mary.name);
		System.out.println("	계좌번호: " + mary.no);
		System.out.println("	예금잔고: " + mary.balance);
		
		
	}
}
package account;

// 보통(일반) 은행 계좌 클래스 -> 부모 클래스
// 계좌명의, 계좌번호, 예금잔액
public class Account {
	private String name;
	private String no;
	private int balance;
	
	public Account(String name, String no, int balance) {
		this.name = name;
		this.no = no;
		this.balance = balance;
	}
	
	public String getName() {
		return name;
	}
	public String getNo() {
		return no;
	}
	public int getBalance() {
		return balance;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	// 입금
	public void deposit(int money) {
		balance += money;
	}
	
	// 출금
	public void withdraw(int money) {
		balance -= money;
	}
	
	// 출력 1번
	public void showInfo() {
		System.out.println("계좌명의: " + name);
		System.out.println("계좌번호: " + no);
		System.out.println("예금잔고: " + balance);
	}
	
	// 출력 2번
	public String toString() {
		return String.format("계좌명의: %s, 계좌번호: %s, 예금잔고: %d", name, no, balance);
	}

}

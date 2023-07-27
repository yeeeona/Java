package account;

// 정기 예금 은행 계좌클래스 -> Account의 자식 클래스 
// 정기 예금 금액(timeBalane) 추
public class TimeAccount extends Account {
	private int timeBalance;
	
	public TimeAccount(String name, String no, int balance, int timeBalance) {
		super(name, no, balance);
		this.timeBalance = timeBalance;
	}
	
	public int getTimeBalance() {
		return timeBalance;
	}
	public void setTimeBalance(int timeBalance) {
		this.timeBalance = timeBalance;
	}
	// 해약
	public void cancel() {
		// balance += timeBalance;
		deposit(timeBalance);
		timeBalance = 0;
	}
	
	// 오버라이딩
	public void showInfo() {
		super.showInfo();
		System.out.println("정기예금금액: " + timeBalance);
	}
	public String toString() {
		return super.toString() + "정기예금금액: " + timeBalance;
	}
}

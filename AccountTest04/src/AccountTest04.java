
// 은행 계좌 클래스
// 추가: 인스턴스를 생성할 때 자동으로 1씩 증가하는 일련번호(식별번호, 아이디)를 추가 
// -> 방법1: 인스턴스 변수를 추가해서 생성자에서 1씩 증가함. -> 잘못됀 방법
// -> 방법2: 
class Account {
	// 클래스 변수, static field (
	// 클래스에서 오직 1개만 생성되고, 모든 인스턴스에서 공유함.
	// 해당 클래스를 사용할 때 생성.
	private static int count = 0;
	
	// 인스턴스 변수, non-static field
	private int id;
	private String name;
	private String no;
	private int balance;
   
	// 생성자
	public Account(String name, String no, int balance) { 
		this.id = ++count;
		this.name = name;
		this.no = no;
		this.balance = balance;
	}
	
	// 클래스 메소드, static method (정적 메소드)
	public static int getCount() {
		return count;
	}
	
	// 인스턴스 메소드, non-static method (비정적 메소드)
	// gettet
	public String getName() {
		return this.name;
    }
	public String getNo() {
		return this.no;
	}
   
    public int getBalance() {
       return this.balance;
    }
   
    // setter
    public void setName(String name) {
       this.name = name;
    }
   
    public void setNo(String no) {
       this.no = no;
    } 
   
    public void setBalance(int balance) {
       this.balance = balance;
    }
   
    // 입금 메소드
    public void deposit(int money) {
       this.balance += money;
    }
   
    // 출금 메소드
    public void withdraw(int money) {
       this.balance -= money;
    }
   
    // 출력 메소드
    public void printAccount() {
	   System.out.println("식별번호: " + id);
	   System.out.println("계좌명의 : " + name);
       System.out.println("계좌번호 : " + no);
       System.out.println("예금잔고 : " + balance);
       System.out.println();
    }
}

public class AccountTest04 {
	public static void main(String[] args) {
		Account john = new Account("John", "123456", 1000);
		Account mary = new Account("Mary", "654321", 500);
		Account rose = new Account("Rose", "778899", 2000);
		
		john.printAccount();
		mary.printAccount();
		rose.printAccount();
		
		System.out.println("빌헹된 은행 계좌 개수: " + Account.getCount()); //클래스를 올바르게 사용하는 방법. 
		System.out.println("빌헹된 은행 계좌 개수: " + mary.getCount());
	}

}

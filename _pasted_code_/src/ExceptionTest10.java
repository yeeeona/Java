// 예외 처리 클래스 생성, 활용

class Account {
   private String no;
   private String name;
   private long balance;
   
   public Account(String no, String name, long balance) {
      this.no = no;
      this.name = name;
      this.balance = balance;
   }
   
   public String getNo() {
      return no;
   }
   public String getName() {
      return name;
   }
   public long getBalance() {
      return balance;
   }
   
   public void setNo(String no) {
      this.no = no;
   }
   
   public void setName(String name) {
      this.name = name;
   }
   
   public void setBalance(long balance) {
      this.balance = balance;
   }
   
   @Override
   public String toString() {
      return no + "(" + name + ")" + balance;
   }
   // 입금
//   public void deposit(long money) {
//	   if(money > 0) {
//		   System.out.println("");
//		   return;
//	   }
//	   balance -= money;
//   }
   
   // 출금
//   public void withdraw(long money) {
//	   if(money > balance) {
//		   System.out.println("은행잔고가 부족합니다.");
//	   }
//	   balance -= money;		   
//	   
//   }
   
   // 예외 처리된 입금 메소드
   public void deposit(long money) throws MinusDepositException{
	   if(money < 0) {
		   throw new MinusDepositException("마이너스 입금 오류: " + money + "원은 입금할 수 없습니다.");
	   }
	   balance += money;
	   System.out.println(name + "님 계좌에" + money + "원이 입금되었습니다.");
   }
   
   // 예외 처리된 출금 메소드
   public void withdraw(long money) throws BalanceInsuffientException{
	   if(balance < money) {
		   throw new BalanceInsuffientException("잔고부족: " + (money-balance) + "");
	   }
	   balance -= money;
	   System.out.println("통장 잔액이 부족합니다.");
   }

   
}

// 마이너스 입금 예외처리 클래스
class MinusDepositException extends Exception {
	private static final long serialVersionUID = 1L;
	
	public MinusDepositException(String msg) {
		super(msg);
	}
}

// 잔고보다 큰 금액 출금 예외처리 클래스
class BalanceInsuffientException extends Exception {
	private static final long serialVersionUID = 1L;
	
	public BalanceInsuffientException(String msg) {
		super(msg);
	}
}

public class ExceptionTest10 {
   public static void main(String[] args) {
	   Account lee = new Account("123456", "이익준", 10000000);
	   System.out.println(lee.toString());
	   
	   // 문제점1 - 마이너스 금액을 입금하는 것은 문제점
	   // 해결책1 - 입금 메소드에서 해결하는 방법
	   //lee.deposit(-1000000);
	   
	   // 해결책2 - 예외처리 클래스와 예외처리 메소드를 만들어 사용하는 방법
	   try {
		   lee.deposit(-1000000);
	   } catch(MinusDepositException e) {
		   System.err.println(e.getMessage());
		   //e.printStackTrace();
	   }
	   System.out.println(lee);
	   System.out.println("-----");
	   
	   // 문제점2 - 예금 금액보다 많은 금액을 출금하는 문제점
	   // 해결책1 - 출금 메소드에서 해결하는 방법
	   // lee.withdraw(20000000);		   
	   
	   // 해결책2 - 예외처리 클래스와 예외처리 메소드를 만들어 사용하는 방법
	   try {
		   lee.withdraw(50000000);		   
	   } catch(BalanceInsuffientException e) {
		   System.err.println(e.getMessage());
		   //e.printStackTrace();
	   }
	   System.out.println(lee);
	   
   }
}
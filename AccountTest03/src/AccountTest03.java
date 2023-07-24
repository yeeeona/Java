/*
 객체 지향
 1. 캡슐화(Encapsulation) -> 멤버변수의 값을 외부로 부터 보호, 은닉  
 2. 상속(Inheritance)
 3. 다형성(Polymorphism) 구현
 
 <클래스의 멤버>
 - 멤버 변수, 멤버 메소드, 생성자 
 
 <접근 제한자, 접근 한정자> -> 4가지 있음.(protected, default)
  private - 같은 클래스 내에서만 사용 가능
  public - 모든 클래스에서 사용 가능
  
  <this>
  - 자신의 클래스에서 멤버 변수, 멤버 메소드를 참조하는 참조변수
  - 자신의 모든 인스턴스가 가지고 있음. 
  
  ★★★★★★
  <생성자>
  
  생성자의 특징
  - 클래스의 이름과 같다.
  - 리턴 타입이 없다.
 
  생성자의 역할
  - 멤버변수의 확실한 초기화를 보장한다. -> 인스턴스를 생성할 때 호출되므로 
  - 생성자는 인스턴스를 만들 때만 호출된다. -> new를 사용하여 인스턴스를 생성할 때
 */


// 은행 계좌 클래스 - 계좌명의, 계좌번호, 예금잔고
// 해결 1 - 아무나 참조변수를 사용하여 접근할 수 없다. -> private
// 해결 2 - 확실한 초기화에 대한 보장을 하고 있다. -> 생성자

class Account {
   // 멤버 변수
   private String name;
   private String no;
   private int balance;
   
   // 기본 생성자
   // 1. 쓰지 않아도 기본적으로 존재하는 생성자
   // 2. 다른 생성자를 만들면 기본 생성자는 사라짐.
   public Account() {
	   
   }
   
   // 생성자 오버로딩
   // 생성자
   public Account(String name, String no, int balance) { // public void가 아닌 public만 쓰는게 특징, 클래스의 이름과 같아야함.
      this.name = name;
      this.no = no;
      this.balance = balance;
      
   }
   
   // accessor - getter/setter를 통칭하여 부를 때
   // getter method - 멤버변수의 값을 리턴하는 메소드
   public String getName() {
      return this.name;
   }
   
   public String getNo() {
      return this.no;
   }
   
   public int getBalance() {
      return this.balance;
   }
   
   // setter - 멤버변수의 값을 설정하는 메소드
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
}

public class AccountTest03 {
   public static void main(String[] args) {
      Account john = new Account("John", "123456", 1000);
      Account mary = new Account("Mary", "654321", 500);
      
      // private 멤버변수에 접근 불가
//      john.balance -= 200;
//      mary.balance +=100;
      
      // 입금 메소드, 출금 메소드를 사용
      john.withdraw(200);
      mary.deposit(100);
      
      System.out.println("● John의 계좌");
      System.out.println("      계좌명의 : " + john.getName());
      System.out.println("      계좌번호 : " + john.getNo());
      System.out.println("      예금잔고 : " + john.getBalance());
      System.out.println();
      
      System.out.println("● Mary의 계좌");
      System.out.println("      계좌명의 : " + mary.getName());
      System.out.println("      계좌번호 : " + mary.getNo());
      System.out.println("      예금잔고 : " + mary.getBalance());
      System.out.println();
   }

}
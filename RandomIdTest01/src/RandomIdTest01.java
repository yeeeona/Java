import java.util.Random;

class RandomId {
   private static int count = 0; // 클래스 변수
   private int id; // 인스턴스 변수
   
   // 클래스 초기자(class initalizer), 클래스 초기화 블럭
   // 동작시점 : 클래스가 사용되기 직전에 딱 1번만 호출
   static {
      //
      Random r = new Random(); // ctrl + shift + o 하면 import java.util.Random; 뜬당
      count = r.nextInt(10)*100; // 100씩 증가하는 난수를 생성, 0~9 * 100 -> 100, 200, 300...900
   }
   
   // 기본 생성자
   public RandomId() {
      this.id = ++count;
   }
   
   // getter
   // 클래스 메소드
   public static int getCount() {
      return count;
   }
   
   public int getId() {
      return id;
   }
}
public class RandomIdTest01 {
   public static void main(String[] args) {
      RandomId r1 = new RandomId();
      RandomId r2 = new RandomId();
      RandomId r3 = new RandomId();
      
      System.out.println("r1'id : " + r1.getId());
      System.out.println("r2'id : " + r2.getId());
      System.out.println("r3'id : " + r3.getId());
   }

}
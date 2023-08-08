
// 메소드 호출 과정에서 예외 던지기
public class ExceptionTest07 {
   public static void main(String[] args) throws Exception{
      try {
         method1();
      } catch(Exception e) {
         // 1번 - 자신의 메소드에서 처리
//         System.err.println(e.getMessage());
//         System.out.println("main에서 예외 처리되었음.");
         
         // 2번 - 예외를 던지기
         throw e;
      }
      
      System.out.println("main이 종료함.");
   }
   public static void method1() throws Exception {
      // 1번 - 자신의 메소드에서 처리
      try {
         method2();
      } catch(Exception e) {
         // System.out.println(e.getMessage());
         // System.out.println("method1에서 예외 처리되었음.");
         
         // 2번 - 예외 던지기
         throw e;
      }
      
   }

   public static void method2() throws Exception {
      // 2번 - 예외 던지기
      throw new Exception("method2에서 예외 발생...");
      
      // 1번 - 자신의 메소드에서 예외 처리
      /*
      try {
         throw new Exception("method2에서 예외 발생...");
      } catch(Exception e) {
         System.err.println(e.getMessage());
         System.err.println("method2에서 예외 처리되었음...");
      }
      */
   
   
   }
   
}
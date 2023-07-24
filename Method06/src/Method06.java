// 문제6) 좌하변이 직각인 직각삼각형을 출력하시오.
// 직각삼각형의  "*"를 출력하는 부분을 메소드로 만들어 사용하시오.


import java.util.Scanner;

public class Method06 {
   
   static void putStar(int n) { // return 값이 있으면 int,double..., 없으면 void적어주기
      for(int i = 1; i <=n; i++) {
         System.out.print("*");
      }
   }
   
   
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.print("정수 입력: ");
      int n = sc.nextInt();
      
      for(int i=1; i<=n; i++) {
         putStar(i);
         /*
         for(int j=1; j<=i; j++) {
            System.out.print("*");
         }
         */
         System.out.println();
      }
      
      
      sc.close();
   }

}
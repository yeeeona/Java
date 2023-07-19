// 문제6) 정수 1개를 입력하여, "*"기호로 우상변이 직각인 직각삼각형을 출력하시오.
// if문을 사용하지 않고, 중첩 반복문 만을 사용하여 작성.
// 힌트: 공백찍고 별찍고.
/*
< 입력 화면 >
길이 입력: 5

< 출력 화면 >
*****
 ****
  ***
   **
    *

*/


import java.util.Scanner;

public class Loop2D06 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      System.out.print("길이 입력: ");
      int n = sc.nextInt();
      
      for(int i=1; i<=n; i++) {
         for(int j=1; j<=i-1; j++) { // 공백
            System.out.print(" ");
         }
         for(int j=1; j<=n+1-i; j++) { // 별표
            System.out.print("*");
         }
         System.out.println();
      }
      
      
      sc.close();
   }

}
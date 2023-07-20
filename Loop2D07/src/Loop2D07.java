// 문제7) 너비(w), 높이(h)를 입력하여 행과 열을 가지는 평행사변형을 출력하시오.

/*
< 입력 화면 >
너비 입력: 7
높이 입력: 4
< 출력 화면 >
   *******
  *******
 *******
*******

*/

import java.util.Scanner;

public class Loop2D07 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      System.out.print("너비 입력: ");
      int w = sc.nextInt();
      System.out.print("높이 입력: ");
      int h = sc.nextInt();
      
      for(int i=1; i<=h; i++) {
         for(int j=1; j<=h-i; j++) {
            System.out.print(" ");
         }
         for(int j=1; j<=w; j++) {
            System.out.print("*");
         }
         System.out.println();
      }
      
      sc.close();
   }

}
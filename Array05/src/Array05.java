// 문제 2) 학생수를 입력하고, 학생수만큼의 int형의 1차원 배열을 생성한 후,
// 배열에 학생의 점수를 입력하고, 학생의 점수를 출력하고,
// 총점과 평균을 구하시오.
// 85, 93, 71, 63, 82
import java.util.Scanner;

public class Array05 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      System.out.print("학생 수를 입력하세요 : ");
      int a = sc.nextInt();
      int[] person = new int[a];
      int sum=0;
      double avg = 0;
      
      for(int i=0; i<person.length;i++) {
         System.out.print("\n학생의 점수를 입력하세요 : "); 
         person[i] = sc.nextInt();
         sum += person[i];
         System.out.printf("%d번 학생의 점수는 %d입니다.\n", i+1, person[i]);
      }
      avg = (double)sum/person.length;
      
      System.out.printf("\n총점 : %d\n평균 : %.2f", sum, avg);
      sc.close();
   }
}
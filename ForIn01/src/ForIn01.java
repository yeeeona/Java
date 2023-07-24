// enhanced for(향상된 for문), 확장 for, for-in문, for-each문
// 장점: 간편하게 사용함, 단점: 무조건 배열 전체를 순회함. 특정 인덱스만을 사용할 수 없음.


public class ForIn01 {
   public static void main(String[] args) {
      // 1차원 배열
      int[] a = new int[] {10, 20, 30, 40, 50};
      
      // 1번 - 기본 for문
      for(int i=0; i<a.length; i++) {
         System.out.print(a[i] + " ");
      }
      System.out.println();
      
      // 2번
      for(int i : a) {
         System.out.print(i + " ");
      }
      System.out.println();
   }
}
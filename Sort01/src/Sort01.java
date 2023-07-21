// 자료구조: 정렬, 검색, 저장 등의 기법들을 배우는 학문.
// 정렬(sort): 데이터를 오름차순, 내림차순 으로 나열 하는것.(만드는 것)

public class Sort01 {
   public static void main(String[] args) {
      int[] a = {30, 70, 20, 10, 50};
      
      // 선택 정렬 전
      System.out.print("선택 정렬 전: ");
      for(int i=0; i<a.length; i++) {
         System.out.printf("%3d", a[i]);
      }
      System.out.println();
            
      for(int i=0; i<a.length-1; i++) {
         for(int j=i+1; j<a.length; j++) {
            if(a[i] > a[j]) {
               int t = a[i];
               a[i] = a[j];
               a[j] =t;
            }
         }
     
         for(int j=0; j<a.length; j++) {
            System.out.printf("%3d", a[j]);
         }
         System.out.println();
      }
      
      // 선택 정렬 후
      System.out.print("선택 정렬 후: ");
      for(int i=0; i<a.length; i++) {
         System.out.printf("%3d", a[i]);
      }
      System.out.println();
   
      
      
      
   }

}
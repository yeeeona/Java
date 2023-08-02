import java.util.Arrays;

// Arrays 클래스 : 배열을 효율적으로 다룰 수 있도록 하는 여러 가지 메소드를 포함하는 클래스 

public class ArraysTest01 {
   public static void main(String[] args) {
      int[] a1 = {10, 20, 30, 40, 50};
      
      // 1. Arrays.copyOf(배열명, 개수) : 배열의 개수만큼 복사하는 메소드
      int[] a2 = Arrays.copyOf(a1, a1.length);
      for(int i = 0 ; i < a2.length ; i++) {
         System.out.println("a2[" + i + "] = " + a2[i]);
      }
      
      // 2. Arrays.toString() : 배열을 문자열 형태로 확인
      System.out.println(Arrays.toString(a1));
      System.out.println(Arrays.toString(a2));
      
      int[] a3 = Arrays.copyOf(a1, 3);
      System.out.println(Arrays.toString(a3));
      
      // 3. Arrays.copyOfRange(배열명, 시작 인덱스, 끝 인덱스) : 배열을 범위만큼 복사하는 메소드, 끝번호는 포함하지 않음.
      int[] a4 = Arrays.copyOfRange(a1, 1, 3);
      System.out.println(Arrays.toString(a4));
      
      // 추가 - 배열 복사 메소드
      // System.arraycopy(원본, 원본 시작 인덱스, 복사본, 복사본 시작 인덱스, 개수)
      int[] a5 = new int[5];
      // int[] a5; // 에러
      System.arraycopy(a1, 0, a5, 0, 5);
      System.out.println(Arrays.toString(a5));
      
      
   }
   
}
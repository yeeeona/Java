import java.util.Arrays;

public class ArraysTest02 {
   public static void main(String[] args) {
      int[] a1 = {10, 20, 30, 40, 50};
      int[] a2 = {30, 40, 50};
      int[] a3 = {30, 40, 50, 60, 70};
      int[] a4 = {10, 20, 30, 40, 50};
      int[] a5 = {50, 40, 30, 20, 10};
      
      // 1. Arrays.equals() : 두 개의 배열을 비교하여 같은지의 여부
      // 1차원 일때 : equals()가 값을 비교
      // deepEquals() 사용할 수 없음.
      System.out.println(Arrays.equals(a1, a2)); // false
      System.out.println(Arrays.equals(a1, a3)); // false
      System.out.println(Arrays.equals(a1, a4)); // true
      System.out.println(Arrays.equals(a1, a5)); // false
      System.out.println("-------");
      
      int[][] b1 = {
            {10, 20, 30},
            {40, 50, 60},
      };
      
      
      
      // 2. Arrays.deepEquals() : 
      // 2차원 배열일 때 : 
      // equals(): 얕은 복사 후 비교 (참조를 비교)
      // deepEquals(): 깊은 복사 후 비교 (실제값(인스턴스)을 비교)
      int[][] b2 = Arrays.copyOf(b1, b1.length);
      System.out.println(Arrays.toString(b1));
      System.out.println(Arrays.toString(b2));
      System.out.println(Arrays.equals(b1, b2)); // true
      System.out.println(Arrays.deepEquals(b1, b2)); // true
      System.out.println("--------");
      
      int[][] b3 = Arrays.copyOf(b1, b1.length);
      b3[0] = Arrays.copyOf(b1[0], b1[0].length);
      b3[1] = Arrays.copyOf(b1[1], b1[1].length);
      System.out.println(Arrays.toString(b1));
      System.out.println(Arrays.toString(b3));
      System.out.println(Arrays.equals(b1, b3)); // false
      System.out.println(Arrays.deepEquals(b1, b3)); // true
      System.out.println("--------");

   }
}
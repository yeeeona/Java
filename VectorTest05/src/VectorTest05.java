import java.util.Vector;

public class VectorTest05 {
   public static void main(String[] args) {
      Vector<Integer> v = new Vector<Integer>();
      
      System.out.println("용량: " + v.capacity()); // 10, 초기 용량
      System.out.println("크기: " + v.size()); // 0
      
      v.add(10); v.add(20); v.add(30); v.add(40); v.add(50);
      System.out.println("- 벡터에 5개의 데이터 추가 -");
      System.out.println("용량: " + v.capacity()); // 10
      System.out.println("크기: " + v.size()); // 5
      
      v.add(10); v.add(20); v.add(30); v.add(40); v.add(50);
      System.out.println("- 벡터에 5개의 데이터 추가 -");
      System.out.println("용량: " + v.capacity()); // 10
      System.out.println("크기: " + v.size()); // 10
      
      v.add(10); v.add(20); v.add(30); v.add(40); v.add(50);
      System.out.println("- 벡터에 5개의 데이터 추가 -");
      System.out.println("용량: " + v.capacity()); // 20
      System.out.println("크기: " + v.size()); // 15
      
      v.add(10); v.add(20); v.add(30); v.add(40); v.add(50);
      System.out.println("- 벡터에 5개의 데이터 추가 -");
      System.out.println("용량: " + v.capacity()); // 20
      System.out.println("크기: " + v.size()); // 20
      
      v.add(10); v.add(20); v.add(30); v.add(40); v.add(50);
      System.out.println("- 벡터에 5개의 데이터 추가 -");
      System.out.println("용량: " + v.capacity()); // 40 -> 용량을 넘길 때 배수로 증가함.
      System.out.println("크기: " + v.size()); // 25
      System.out.println("-----");
      
      v.add(10); v.add(20); v.add(30); v.add(40); v.add(50);
      v.add(10); v.add(20); v.add(30); v.add(40); v.add(50);
      v.add(10); v.add(20); v.add(30); v.add(40); v.add(50);
      v.add(10); v.add(20); v.add(30); v.add(40); v.add(50);
      System.out.println("용량: " + v.capacity()); // 80 -> 용량을 넘길 때 배수로 증가함.
      System.out.println("크기: " + v.size()); // 45
   }

}
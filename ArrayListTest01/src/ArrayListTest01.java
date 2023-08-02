import java.util.ArrayList;

/*
 <ArrayList>
 1. Vector와 기능이 거의 동일함.
 2. Vector에서 쓰레드의 동기화 기능을 제거하여 성능을 개선함
  -> Vector의 쓰레드의 동기화를 사용하면 성능 저하가 발생
 3. Vector의 Capacity() 메소드가 없음.
  -> insertElementAt(), removeAllElements(), firstElement(), lastElement()...
  
 문제 2) 아래의 조건에 부합하는 리스트를 생성하고, 활용
 1. 정수를 저장하는 리스트인 list를 생성.
 1. 리스트 list에 배열 scores의 값을 추가하고, 확인
 2. list에서 60점 미만의 데이터는 삭제하고, 확인
 3. list의 총점과 평균을 구하시오
 4. list에서 최고점수와 최저점수를 구하시오
 5. list를 2가지 방법으로 출력(기본 for문, 확장 for문)
 */
public class ArrayListTest01 {
   public static void main(String[] args) {
      int[] scores = {95, 88, 75, 63, 52, 77, 47, 48, 93, 91};
      
      // 1. 리스트 생성
      ArrayList<Integer> list = new ArrayList<Integer>();
      
      // 2. 데이터 추가
      for(int s : scores) {
         list.add(s);
      }
      System.out.println(list);
      System.out.println("*********");
      
      // 3. 데이터 삭제
      /*
      // 3-1.잘못된 방법
      list.remove(4);
      System.out.println(list); //[95, 88, 75, 63, 77, 47, 48, 93, 91] -> 52삭제
      list.remove(6);
      System.out.println(list);//[95, 88, 75, 63, 77, 47, 93, 91] -> 48삭제
      list.remove(7);
      System.out.println(list);//[95, 88, 75, 63, 77, 47, 93] -> 91삭제
      */
      // 3-2. 반복문 처리 -> 잘못된 방법
      /*
      for(int i=0; i<list.size(); i++) {
         if(list.get(i) < 60) {
            list.remove(i);
         }
      }
      System.out.println(list);
      */
      
      // 3-3. 반복문 처리 -> 올바른 방법
      for(int i=list.size()-1; i>=0; i--) {
    	  if(list.get(i) < 60) {
    		  list.remove(i);
    	  }
      }
      System.out.println(list);
      
      // 4. 총점, 평균
      int sum = 0;
      for(int s : list) {
         sum += s;
      }
      double avg = (double)sum / list.size();
      System.out.println("총점 : " + sum);
      System.out.println("평균 : " + avg);
      
      // 5. 최고점수, 최저점수
      int max = list.get(0);
      int min = list.get(0);
      for(int i=1; i<list.size();i++) {
         if(list.get(i) > max) {
            max = list.get(i);
         }
         if(list.get(i) < min) {
            min = list.get(i);
         }
      }
      System.out.printf("최고점수 : %d\n최저점수 : %d\n", max, min);
      System.out.println("-----------");
      
      // 6-1. 출력 - 기본 for문
      for(int i=0; i<list.size(); i++) {
         System.out.println("list[" + i + "] = " + list.get(i));
      }
      System.out.println("---------");
      
      // 6-2. 출력 - 확장 for문
      for(int s : list) {
         System.out.println(s);
      }
      System.out.println("-------------");
      
      // 6-3. 출력3 
      
      
   }
}
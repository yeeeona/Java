import java.util.Iterator;
import java.util.LinkedList;

class Point {
   private int x;
   private int y;
   
   public Point(int x, int y) {
      this.x = x;
      this.y = y;
   }
   
   // getter
   public int getX() {
      return x;
   }
   
   public int getY() {
      return y;
   }
   
   // setter
   public void setX(int x) {
      this.x = x;
   }
   
   public void setY(int y) {
      this.y = y;
   }
   
   @Override
   public String toString() {
      return "(" + x + "," + y + ")";
   }
   
   // 두 개의 좌표값을 비교하는 메소드
   /*
   public boolean equals(Point p) {
      if(this.x == p.x && this.y == p.y ) {
         return true;
      } else {
         return false;
      }
   }
   */
   // 두 개의 좌표값을 비교하는 메소드 -> 간결하게 작성
   public boolean equals(Point p) {
      return this.x == p.x && this.y == p.y;
   }
}

/*
 문제1) 아래의 조건을 부합하는 LinkedList인 list를 생성하고, 활용.
 1. 리스트에 Point 객체 10개를 저장.
 ex) (10, 10), (20, 20), (30, 30) ...(100, 100)
 2. (10, 10) 뒤에 (15, 15)를 추가.
 3. (40, 40) 데이터 삭제
 4. (50, 50) 데이터를 (55, 55)로 변경
 5. 리스트 맨 앞에 (1, 1) 데이터를 추가
 6. 리스트의 내용을 3가지 방법으로 출력(기본 for문, 확장for문, Iterator)
 */

public class LinkedListTest02 {
   public static void main(String[] args) {
      // 리스트 생성
      LinkedList<Point> list = new LinkedList<Point>();
      
      // 1. 순차적 데이터 추가
      for(int i = 10; i<=100; i+=10) {
         list.add(new Point(i,i));
      }
      System.out.println(list);
      
      /*
	  int [][] n = {
			  {10, 10}, {20, 20}, {30, 30}, {40, 40}, {50, 50},
			  {60, 60}, {70, 70}, {80, 80}, {90, 90}, {100, 100}
			  };
	  for(int i=0; i<n.length; i++) {
		  int x = n[i][0];
		  int y = n[i][1];
		  list.add(new Point(x,y));
	  }
	  System.out.println(list);
	  */
       
      
      // 2. 비순차적 데이터 처리 - (10, 10) 뒤에 (15, 15) 추가
      /*
      list.add(1, new Point(15,15));
      System.out.println(list);
      */
      /*
      //  1. 해결함
      // - 개선점 : 두 좌표값을 비교하는 것도 Point 클래스의 기능임을 추가
      for(int i=0; i<list.size();i++) {
         Point p = list.get(i);
         if(p.getX()==10 && p.getY()==10) {
            list.add(i+1, new Point(15,15));
         }
      }
      System.out.println(list);
      */
      // 2. 해결함
      // - 두 좌표값을 비교하는 인스턴스 메소드를 만들어 사용함 -> 개선된 방식
      for(int i=0; i<list.size();i++) {
         if(list.get(i).equals(new Point(10,10))) {
            list.add(i+1, new Point(15,15));
         }
      }
      System.out.println(list);
      
      // 3. 데이터 삭제
      /*
      list.remove(4);
      System.out.println(list);
      */
      for(int i =0; i<list.size(); i++) {
         if(list.get(i).equals(new Point(40, 40))) {
            list.remove(i);
         }
      }
      System.out.println(list);
      
      // 4. 데이터 변경
      /*
      list.set(4, new Point(55,55));
      System.out.println(list);
      */
      for(int i=0; i<list.size();i++) {
         if(list.get(i).equals(new Point(50,50))) {
            list.set(i, new Point(55,55));
         }
      }
      System.out.println(list);
      
      // 5. 맨 앞에 데이터 추가
      list.add(0, new Point(1,1));
      //list.addFirst(new Point(1,1));
      System.out.println(list);
      
      System.out.println("-------------");
      
      // 6-1. 출력 1 - 기본 for문
      for(int i=0; i<list.size();i++) {
         System.out.println(list.get(i));
      }
      System.out.println("--------------");
      
      // 6-2. 출력 2 - 확장 for문
      for(Point p : list) {
         System.out.println(p);
      }
      
      // 6-3. 출력 3 - Iterator
      Iterator<Point> it = list.iterator();
      while(it.hasNext()) {
         System.out.println(it.next());
      }
      System.out.println("----------------");

   }
}
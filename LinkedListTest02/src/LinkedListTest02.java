import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

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
	// 오버로딩
	/*
	public boolean equals(Point p) {
		if(this.x == p.x && this.y == p.y) {
			return true;
		} else {
			return false;
		}
	}
	*/
	
	// 메소드 추가
	// 두 개의 좌표값을 비교하는 메소드 -> 간결하게 작성
	// 오버로딩
	/*
	public boolean equals(Point p) {
		return this.x==p.x && this.y==p.y;
	}
	*/
	
	// Object 클래스 equals() 오버라이딩
	@Override
	public boolean equals(Object obj) {
		Point p = (Point)obj;
		return this.x==p.x && this.y==p.y;
	}
	
}

/*
문제1) 아래의 조건을 부합하는 LinkedList인 list를 생성하고, 활용하시오.
1. 리스트에 Point 객체 10개를 저장하시오.
ex) (10,10), (20,20), (30,30) ... (100,100)
2. (10,10) 뒤에 (15, 15)를 추가하시오.
3. (40,40) 데이터를 삭제하시오.
4. (50,50) 데이터를 (55,55)로 변경하시오.
5. 리스트의 맨 앞에 (1, 1) 데이터를 추가하시오.
6. 리스트의 내용을 3가지 방법으로 출력하시오. (기본 for문, 확장 for문, Iterator)
*/
public class LinkedListTest02 {
	public static void main(String[] args) {
		// 리스트 생성
		List<Point> list = new LinkedList<Point>();
		
		// 1. 순차적 데이터 추가
		for(int i=10; i<=100; i+=10) {
			list.add(new Point(i, i));
		}
		System.out.println(list);
		
		// 2. 비순차(중간)적 데이처 추가 - (10,10) 뒤에 (15,15) 추가
		/*
		list.add(1, new Point(15, 15));
		System.out.println(list);
		*/
		// 1. 해결함
		// - 개선점: 두 좌표값을 비교하는 것도 Point 클래스의 기능임을 추가
		/*
		for(int i=0; i<list.size(); i++) {
			Point p = list.get(i);
			if(p.getX()==10 && p.getY()==10) {
				list.add(i+1, new Point(15, 15));
			}
		}
		System.out.println(list);
		*/
		// 2. 해결함
		// - 두 좌표값을 비교하는 인스턴스 메소드를 만들어 사요함. -> 개선된 방식
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).equals(new Point(10, 10))) {
				list.add(i+1, new Point(15, 15));
			}
		}
		System.out.println(list);
		
		// 3. 데이터 삭제 - (40,40) 데이터 삭제
		/*
		list.remove(4);
		System.out.println(list);
		*/
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).equals(new Point(40, 40))) {
				list.remove(i);
			}
		}
		System.out.println(list);
		
		// 4. 데이터 변경 - (50,50) 데이터를 (55,55)로 변경
		/*
		list.set(4, new Point(55, 55));
		System.out.println(list);
		*/
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).equals(new Point(50, 50))) {
				list.set(i, new Point(55, 55));
			}
		}
		System.out.println(list);
		
		// 5. 맨 앞에 (1,1) 데이터를 추가
		list.add(0, new Point(1, 1));
		//list.addFirst(new Point(1, 1));
		System.out.println(list);
				
		System.out.println("----");
		// 6-1. 출력1 - 기본 for문
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("-----");
		
		// 6-2. 출력2 - 확장 for문
		for(Point p : list) {
			System.out.println(p);
		}
		System.out.println("-----");
		
		// 6-3. 출력3 - Iterator 사용
		Iterator<Point> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("-----");
		
	}
}

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

class Fruit implements Comparable<Fruit> {
	private String name; // 과일 이름
	private int price;   // 과일 가격
	private int volume;  // 과일 수량
	
	public Fruit(String name, int price, int volume) {
		this.name = name;
		this.price = price;
		this.volume = volume;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPrice() { 
		return price;
	}
	
	public int getVolume() {
		return volume;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	@Override
	public String toString() {
		return name + "(가격:" + price + ", 수량:" + volume + ")"; 
	}

	// Comparable 인터페이스의 compareTo() 추상 메소드를 오버라이딩
	// 정렬 기준: 과일이름, 과일가격, 과일수량 중에서 선택
	// 1. 과일 가격: 오름 차순 정렬
	/*
	@Override
	public int compareTo(Fruit f) {
		if(this.price > f.price) return 1; // 인스턴스가 매개변수보다 크다면 양수(1)
		else if(this.price < f.price) return -1; // 인스턴스가 매개변수보다 작다면 음수(-1)
		else return 0; // 인스턴스와 매개변수와 같다면 0
	}
	*/
	
	// 2. 과일 가격: 내림 차순 정렬
	/*
	@Override
	public int compareTo(Fruit f) { 
		if(this.price < f.price) return 1; // 인스턴스가 매개변수보다 작다면 양수(1)
		else if(this.price > f.price) return -1; // 인스턴스가 매개변수보다 크다면 음수(-1)
		else return 0; // 인스턴스와 매개변수와 같다면 0
	}
	*/
	
	// 3. 과일 수량: 오름 차순 정렬
	/*
	@Override
	public int compareTo(Fruit f) {
		if(this.volume > f.volume) return 1;
		else if(this.volume < f.volume) return -1;
		else return 0;
	}
	*/
		
	// 4. 과일 수량: 내림 차순 정렬
	/*
	@Override
	public int compareTo(Fruit f) {
		if(this.volume < f.volume) return 1;
		else if(this.volume > f.volume) return -1;
		else return 0;
	}
	*/
	
	// 5. 과일 이름: 오름 차순 정렬
	@Override
	public int compareTo(Fruit f) {
		if(this.name.compareTo(f.name) > 0) return 1;
		else if(this.name.compareTo(f.name) < 0) return -1;
		else return 0;
	}
	
	// 6. 과일 이름: 내림 차순 정렬
	/*
	@Override
	public int compareTo(Fruit f) {
		if(this.name.compareTo(f.name) < 0) return 1;
		else if(this.name.compareTo(f.name) > 0) return -1;
		else return 0;
	}
	*/
}

// TreeSet에 사용자 정의 클래스를 저장할 때 발생하는 문제점
// -> 예외 발생: Exception in thread "main" java.lang.ClassCastException: Fruit cannot be cast to java.lang.Comparable

// Comparable 인터페이스: 두 개의 데이터를 비교하여 정렬하는 기능을 가진 인터페이스
// -> 해결책: 추상 메소드 compareTo()를 오버라이딩 해야함.
public class TreeSetTest07 {
	public static void main(String[] args) {
		// 셋 생성
		Set<Fruit> set = new TreeSet<Fruit>();
		
		// 데이터 추가 - 순서가 없다. 
		// Comparable 인터페이스의 compareTo() 메소드를 오버라이딩 -> 과일이름 기준으로 오름차순 정렬
		set.add(new Fruit("체리", 1000, 35));
		set.add(new Fruit("포도", 6000, 27));
		set.add(new Fruit("수박", 15000, 32));
		set.add(new Fruit("참외", 1000, 45));
		set.add(new Fruit("레몬", 1000, 18));
		System.out.println(set.toString());
		
		// 중복 데이터의 문제는 정렬 기준에 따라 결정
		// 과일 이름을 기준으로 정렬한다고 가정하면, 같은 과일 이름을 중복으로 인식함.
		// 과일 가격을 기준으로 정렬한다고 가정하면, 같은 과일 가격을 중복으로 인식함.
		// 과일 수량을 기준으로 정렬한다고 가정하면, 같은 과일 수량을 중복으로 인식함.
		// 1. 중복 데이터 추가
		set.add(new Fruit("수박", 12000, 20)); // 데이터 추가 -> 허용 불가 -> 같은 과일 이름이 있으므로
		System.out.println(set);
		
		set.add(new Fruit("메론", 15000, 40)); // 데이터 추가 -> 허용함
		System.out.println(set);
		
		// 2. 데이터 변경 - 포도의 가격을 8000으로 변경
		/*
		// 2-1. 확장 for문 
		for(Fruit f : set) {
			if(f.getName().equals("포도")) {
				f.setPrice(8000);
			}
		}
		System.out.println(set);
		*/
		
		// 2-2. Iterator 사용
		Iterator<Fruit> it = set.iterator();
		while(it.hasNext()) {
			Fruit f = it.next();
			if(f.getName().equals("포도")) {
				f.setPrice(8000);
			}
		}
		System.out.println(set);
		
		// 3. 데이터 삭제 - 가격이 1000인 과일을 삭제
		/*
		// 3-1. 
		// 에러 발생: Exception in thread "main" java.util.ConcurrentModificationException
		// 검색과 동시에 삭제는 불가
		for(Fruit f : set) { 
			if(f.getPrice() == 1000) {
				set.remove(f);
			}
		}
		System.out.println(set);
		*/
			
		// 3-2. 가격이 1000원인 1개의 데이터만 삭제
		// 1000이 1개일 때는 가능, 여러 개일때는 마지막에 나오는 1개만 가능
		// 체리는 삭제되었지만, 참외는 삭제되지 않음.
		/*
		Fruit df = null;
		for(Fruit f: set) {
			if(f.getPrice() == 1000) {
				df = f;
			}
		}
		set.remove(df);
		System.out.println(set);
		*/
		
		// 3-3. 가격이 1000인 모든 데이터를 삭제
		ArrayList<Fruit> fList = new ArrayList<Fruit>();
		for(Fruit f : set) {
			if(f.getPrice() == 1000) {
				fList.add(f);
			}
		}
		
		for(Fruit f : fList) {
			set.remove(f);
		}
		System.out.println(set);
		System.out.println("-----");
		
		/*
		// 4-1. 출력1 - 확장 for문
		for(Fruit f : set) {
			System.out.println(f);
		}
		System.out.println("-----");
		
		// 4-2. 출력2 - Iterator 사용
		Iterator<Fruit> it2 = set.iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
		*/
		
	}

}

import java.util.Iterator;
import java.util.TreeSet;

class Fruit implements Comparable<Fruit>{
	private String name; // 과일 이름
	private int price; // 과일 가격
	private int volume; // 과일 수량
	
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
		return name + "(가격: " + price + ", 수량: " + volume + ")";
	}
	
	// Comparable 인터페이스의 compareTo() 추상 메소드를 오버라이딩
	// 정렬 기준: 과일이름, 과일 가격, 과일 수량 중에서 선택
	
	// 1. 과일 가격: 오름 차순 정렬
//	@Override
//	public int compareTo(Fruit f) {
//			if(this.price > f.price) return 1;
//			else if(this.price < f.price) return -1;
//			else return 0;
//	
//	}
	
	
	// 2. 과일 가격: 내림 차순 정렬
//	@Override
//	public int compareTo(Fruit f) {
//		if(this.price < f.price) return 1;
//		else if(this.price > f.price) return -1;
//		else return 0;
//		
//	}
	
	
	// 3. 과일 수량: 오름 차순 정렬
	
//	public int compareTo(Fruit f) {
//		if(this.volume > f.volume) return 1;
//		else if(this.volume < f.volume) return -1;
//		else return 0;
//		
//	}
	
	// 4. 과일 수량: 내림 차순 정렬
	
//	public int compareTo(Fruit f) {
//		if(this.volume < f.volume) return 1;
//		else if(this.volume < f.volume) return -1;
//		else return 0;
//	}
	
	// 5. 과일 이름: 오름 차순 정렬
	public int compareTo(Fruit f) {
		if(this.name.compareTo(f.name) > 0) return 1;
		else if(this.name.compareTo(f.name) < 0) return -1;
		else return 0;
	}
	
	// 6. 과일 이름: 내림 차순 정렬
	
}

// TreeSet에 사용자 정의 클래스르 저장할 때 발생하는 문제점

// Comparable 인터페이스: 두 개의 데이터를 비교하여 정렬하는 기능을 가진 인터페이스
// -> 해결책: 추상 메소드 compareTo() 오버라이딩 해야함.
//
public class TreeSetTest07 {
	public static void main(String[] args) {
		// 셋 생성
		TreeSet<Fruit> set = new TreeSet<Fruit>();
		
		// 데이터 추가 - 순서가 없다.
		set.add(new Fruit("체리", 1000, 35));
		set.add(new Fruit("포도", 6000, 27));
		set.add(new Fruit("수박", 15000, 32));
		set.add(new Fruit("참외", 4500, 45));
		set.add(new Fruit("레몬", 5300, 18));
		System.out.println(set);
		
		// 중복 데이터의 문제는 정렬 기준에 따라 결정
		// 가격, 수량으로 정렬한다면 그 기준에 따라 중복인식이 달라짐.
		// 과일 가격을 기준으로 정렬한다고 가정하면, 같은 과일 이름을 중복으로 인식
		// 1. 중복 데이터 추가
		set.add(new Fruit("수박", 12000, 20)); // 데이터 추가 -> 허용 불가
		System.out.println(set);
		
		set.add(new Fruit("레몬", 12000, 20)); // 데이터 추가 -> 허용
		System.out.println(set);
		
		// 데이터 변경 - 포도의 가격을 8000으로 변경
		/*
		2-1. 확장 for문
		for(Fruit f : set) {
			if(f.getName().equals("포도")) {
				f.setPrice(8000);
			}
		}
		System.out.println(set);	
		*/
		// 2-2 Iterator
		Iterator<Fruit> it = set.iterator();
		while(it.hasNext()) {
			Fruit f = it.next();
			if(f.getName().equals("포도")) {
				f.setPrice(8000);
			}
		}
		System.out.println(set);
		
		// 데이터 삭제 - 가격이 1000인 과일을 삭제
		// 3-1. 확장 for문
		// 검색과 동시에 삭제는 불가
//		for(Fruit f : set) {
//			if(f.getPrice() == 1000) {
//				set.remove(f);
//			}
//		}
//		System.out.println(set);
		
		// 3-2
		/*
		Fruit df;
		for(Fruit f: set) {
			if(f.getPrice() == 1000) {
				df = f;
			}
		}
		set.remove(df);
		System.out.println(set);
		*/
		

	}

}

package drink;

// 부모 클래스 " 음 료 수 "
public class Drink {
	private String name;
	private String volume;
	private int price;
	
	// 기본 생성자
	public Drink(String name, String volume, int price) {
		this.name = name;
		this.volume = volume;
		this.price = price;
	}
	
	// getter
	public String getName() {
		return name;
	}
	public String getVolume() {
		return volume;
	}
	public int getPrice() {
		return price;
	}
	
	// setter
	public void setName(String name) {
		this.name = name;
	}
	public void setType(String volume) {
		this.volume = volume;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	// 출력
	public void printInfo() {
		System.out.println("제품명: " + name);
		System.out.println("용량: " + volume + "ml");
		System.out.println("가격: " + price + "원");
	}
	
}

package drink;

// 자식 클래스
public class ZeroDrink extends Drink{
	private String kcal;
	
	// 기본 생성자
	public ZeroDrink(String name, String volume, int price, String kcal) {
		super(name, volume, price);
		this.kcal = kcal;
	}
	
	// getter
	public String getKcal() {
		return kcal;
	}
	
	// setter
	public void setKcal(String kcal) {
		this.kcal = kcal;
	}
	
	// 오버라이딩
	@Override
	public void printInfo(){
		System.out.println("제품명: " + getName());
		System.out.println("용량: " + getVolume() + "ml");
		System.out.println("가격: " + getPrice()+ "원");
		System.out.println("칼로리: " + kcal + "kcal");
		System.out.println("\n제로칼로리 음료수입니다.");
	}
	
	// instanceof
	public void features(int f) {
		switch(f) {
		case 1: System.out.println("다이어트 중에도 부담없이 먹을 수 있습니다."); break;
		case 2: System.out.println("햘당조정에 도움이 될 수 있습니다."); break;
		}
	}
	
}

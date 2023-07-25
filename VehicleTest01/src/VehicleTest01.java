/*
문제2) 아래의 조건을 부합하는 Vehicle 클래스를 생성하고, 인스턴스를 만들어 사용하시오.
1. 멤버변수: 회사(company), 모델명(model), 색상(color), 최고속도(maxSpeed)
2. 생성자: 기본 생성자, 매개변수로 초기화 생성자
3. 멤버메소드: getter, setter, printInfo(정보출력 메소드)
4. 인스턴스를 5개 만들어 사용하시오. (1개는 getter, setter 사용)

*/

class Vehicle {
	private String company;
	private String model;
	private String color;
	private int maxSpeed;
	
	// 기본 생성자
	public Vehicle() {
		
	}
	
	public Vehicle(String company, String model, String color, int maxSpeed) {
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	// getter
	public String getCompany() {
		return this.company;
	}
	public String getModel() {
		return this.model;
	}
	public String getColor() {
		return this.color;
	}
	public double getMaxSpeed() {
		return this.maxSpeed;
	}
	
	// setter
	public void setCompany(String company) {
		this.company = company;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	public void printInfo() {
		System.out.println("회사: " + company + " 모델명: " + model + " 색상: " + color + " 최고속도: " + maxSpeed);
	}
}

public class VehicleTest01 {
	public static void main(String[] args) {
		Vehicle c1 = new Vehicle("Hundai", "Casper", "Blue", 130);
		Vehicle c2 = new Vehicle("Kia", "Morning", "black", 120);
		Vehicle c3 = new Vehicle("BMW", "X7", "Gray", 280);
		Vehicle c4 = new Vehicle("Audi", "S8", "black", 310);
		Vehicle c5 = new Vehicle();
		
		// 출력
		c1.printInfo();
		c2.printInfo();
		c3.printInfo();
		c4.printInfo();
		
		// getter
		c5.setCompany("Benz");
		c5.setModel("AMG");
		c5.setColor("Red");
		c5.setMaxSpeed(310);
		
		// getter
		System.out.println("회사명: " + c5.getCompany());
		System.out.println("모델명: " + c5.getModel());
		System.out.println("색상: " + c5.getColor());
		System.out.println("최대속도: " + c5.getMaxSpeed());
	}

}

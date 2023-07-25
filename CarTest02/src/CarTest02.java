import java.util.Scanner;

class Car {
	// 멤버 변수
	// 인스턴스 변수 - 인스턴스에 포함되는 변수
	private String name;
	private int width;
	private int height;
	private int length;
	private double x;
	private double y;
	private double fuel;
	
	// 매개변수를 갖는 생성자
	public Car(String name, int width, int height, int length, double fuel) {
		this.name = name;
		this.width = width;
		this.height = height;
		this.length = length;
		this.fuel = fuel;
		x = y = 0.0;
	}
	
	// getter
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	public double getFuel() {
		return fuel;
	}
	
	// setter
	public void setX(double x) {
		this.x = x;
	}
	public void setY(double y) {
		this.y = y;
	}
	public void setFuel(double fuel) {
		this.fuel = fuel;
	}
	
	// 차의 제원 출력
	public void putSpec() {
		System.out.println("차 이름: " + name);
		System.out.println("차 너비: " + width);
		System.out.println("차 높이: " + height);
		System.out.println("차 길이: " + length);
	}
	
	// 차의 이동
	public boolean move(double x, double y) {
		double distance = Math.sqrt(x*x + y*y);
		
		if(fuel > distance) { // 이동가능
			this.x += x;
			this.y += y;
			this.fuel -= distance;
			return true;
		} else { // 이동 불가능
			return false;
		}
	}
}
public class CarTest02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("자동차의 제원을 입력하시오. ");
		System.out.print("이름: ");
		String name = sc.next();
		System.out.print("너비: ");
		int width = sc.nextInt();
		System.out.print("높이: ");
		int height = sc.nextInt();
		System.out.print("길이: ");
		int length = sc.nextInt();
		System.out.print("연료량: ");
		double fuel = sc.nextDouble();
		
		Car car = new Car(name, width, height, length, fuel);
		System.out.println();
		
		// 차의 이동을 제어
		while(true) {
			System.out.printf("현재위치: (%.2f, %.2f), 연료량: %.2f\n", car.getX(), car.getY(), car.getFuel());
			System.out.print("이동하시겠습니까?(YES:1 / NO:0): ");
			int yn = sc.nextInt();
			if(yn == 0)break;
			
			System.out.print("x방향 이동거리: ");
			double x = sc.nextDouble();
			System.out.print("y방향 이동거리: ");
			double y = sc.nextDouble();
			
			if(!car.move(x,y)) {
				System.out.println("연료가 부족합니다.");
			}
		}
		System.out.println("차가 정지하였습니다...");
		sc.close();
		
	}
}

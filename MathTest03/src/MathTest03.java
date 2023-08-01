import java.util.Random;

public class MathTest03 {

	public static void main(String[] args) {
	
		// 다양한 난수를 생성하는 방법
		// 난수: 무작위수, random number, 정해지지 않은 수
		// Math.random(), Random 클래스
		// random(): 0 ~ 1 미만의 실수 난수를 생성하는 메소드
		System.out.println(Math.random());
		
		// 범위의 정수 난수를 생성하는 방법
		// 1. 0 ~ 9 사이의 난수
		// 0 ~ 0.9999... * 9 -> 0.9.9999... -> 0 ~ 9
		int rn = (int)(Math.random() * 10);
		System.out.println(rn);
		
		// 2. 1 ~ 10 사이의 난수
		// 0 ~ 0.9999 * 10 -> 0 ~ 9.9999 -> 0 ~ 9 -> 1 ~ 10
		int rn2 = (int)(Math.random()* 10 + 1);
		System.out.println(rn2);
		
		// 3. 로또 번호( 1 ~ 45 사이의 난수)
		// 0 ~ 0.9999 * 45 -> 0 ~ 44.9999 -> 0 ~ 44 -> 1 ~ 45
		int rn3 = (int)(Math.random() * 45) + 1;
		System.out.println(rn3);
		
		// < 2. 범위의 정수 난수를 생성하는 방법 2> - Random 클래스 사용
		// 1. 0 ~ 9 사이의 난수
		Random r = new Random();
		int rn4 = r.nextInt(10); // 0 ~ 10 미만의 난수, 0 ~ 9 사이의 난수
		System.out.println(rn4);
		
		// 2. 1 ~ 10 사이의 난수
		// 0 ~9 -> 1 ~ 10
		int rn5 = r.nextInt(10) + 1;
		System.out.println(rn5);
		
		// 3. 로또 번호( 1~ 45 사이의 난수)
		// 0 ~ 44 -> 1 ~ 45
		int rn6 = r.nextInt(45) + 1;
		System.out.println(rn6);
		
	}

}

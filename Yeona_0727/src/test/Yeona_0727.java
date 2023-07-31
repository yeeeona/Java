package test;

// 클래스 전부(2개) 선언
import drink.*;

public class Yeona_0727 {
	public static void main(String[] args) {
		
		// 배열
		Drink[] drinks = new Drink[] {
				new Drink("게토레이", "600", 2100),
				new ZeroDrink("밀키스", "250", 1500, "0"),
				new Drink("모구모구", "320", 1700),
				new ZeroDrink("보성홍차", "500", 1450, "0"),
		};
		
		// 출력
		for(int i=0; i<drinks.length; i++) {
			drinks[i].printInfo();
			if(drinks[i] instanceof ZeroDrink) {
				((ZeroDrink) drinks[i]).features(1);
			}
			System.out.println();
		}
	}

}

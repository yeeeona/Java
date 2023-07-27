package test;

import account.*;

public class AccountTest05 {
	public static void main(String[] args) {
		Account a1 = new Account("옥택연", "123456", 1000);
		TimeAccount a2 = new TimeAccount("원지안", "654321", 3000, 100);
		
		Account x;
		x = a1;
		x = a2; // 가능: 부모의 참조변수는 자식의 인스턴스를 참조할 수 있다.
		
		TimeAccount y;
		//y = a1; // 불가능: 자식의 참조변수는 부모의 인스턴스를 참조할 수 없다.
		y = a2;
		
		System.out.println(a1.toString());
		System.out.println(a2.toString());
		System.out.println();
		
		a1.showInfo();
		System.out.println();
		a2.showInfo();
		System.out.println();
		
		
		
	}

}

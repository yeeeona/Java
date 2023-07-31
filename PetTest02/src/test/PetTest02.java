package test;

import pet.*;
/*
퀴즈1) 상속 관계의 2개의 클래스를 만들고, 인스턴스의 배열을 만들어 활용하시오.
- 부모: 인스턴스 변수는 3개, 자식: 1개 추가
- 부모 클래스, 자식 클래스, super, overriding, 어노테이션, instanceof
ex) 부모: Coffee, 자식: EspressoCoffee
	부모: Car, 자식: SuperCar
 */

public class PetTest02 {
	public static void main(String[] args) {
		// 인스턴스 배열 1번
		/*
		Pet[] pets = new Pet[4];
		pets[0] = new Pet("나비", "안정원");
		pets[1] = new RobotPet("마크", "장겨울");
		pets[2] = new Pet("감자", "이익준");
		pets[3] = new RobotPet("제리", "채송화");
		*/
		
		// 인스턴스 배열 2번
		Pet[] pets = new Pet[] {
				new Pet("나비", "안정원"),
				new RobotPet("마크", "장겨울"),
				new Pet("감자", "이익준"),
				new RobotPet("제리", "채송화"),
		};
		
		// 출력 1번 - 기본 for문
		for(int i=0; i<pets.length; i++) {
			pets[i].introduce();
			if(pets[i] instanceof RobotPet) {
				((RobotPet) pets[i]).work(2);
			}
			System.out.println();
		}
		
		// 출력 2번 - 확장 for문
//		for(Pet p : pets) {
//			p.introduce();
//			if(p instanceof RobotPet) {
//				((RobotPet) p).work(0);
//			}
//			System.out.println();
//		}
	}

}

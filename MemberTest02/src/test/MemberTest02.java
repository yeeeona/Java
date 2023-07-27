package test;

// 다형성(Polymorphism) 구현
// - 상속의 관계를 만들어서 한꺼번에 처리할 수 있도록 하는 것
import member.*;

public class MemberTest02 {
	public static void main(String[] args) {
//		SpecialMember p1 = new SpecialMember("김영미", "1", 43, "10% 할인");
//		SpecialMember p2 = new SpecialMember("박춘삼", "2", 55, "1일 무료");
//		Member p3 = new Member("김옥자", "3", 63);
//		Member p4 = new Member("강산", "4", 28);
		
		// 다형성 구현
		Member[] members = new Member[] {
				new SpecialMember("김영미", "1", 43, "우대혜택"),
				new SpecialMember("박춘삼", "2", 55, "우대헤택"),
				new Member("김옥자", "3", 63),
				new Member("강산", "4", 28),
		};
		
		// 1번 - 기본for문
		for(int i=0; i>members.length; i++) {
			System.out.println(members[i].toString());
		}
		// 2번 - 확장 for문
		for(Member m: members) {
			System.out.println(m.toString());
		}
		
		
		
//		System.out.println(p1);
//		System.out.println(p2);
//		System.out.println(p3);
//		System.out.println(p4);
//		System.out.println("----------");
//		
//		p1.showInfo();
//		System.out.println();
//		p2.showInfo();
//		System.out.println();
//		p3.showInfo();
//		System.out.println();
//		p4.showInfo();
//		System.out.println();
		
	}
}

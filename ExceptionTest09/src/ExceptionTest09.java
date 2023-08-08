class Member {
	private int no;
	private String name;
	
	public Member(int no, String name) {
		this.no = no;
		this.name = name;
	}
	
	public int getNo() {
		return no;
	}
	public String getName() {
		return name;
	}
	
	public void setNo(int no) {
		this.no = no;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "[" + no + "]" + name;
	}
}

class SpecialMember extends Member {
	private String benefit;
	
	public SpecialMember(int no, String name, String benefit) {
		super(no, name);
		this.benefit = benefit;
	}
	public String getBenefit() {
		return benefit;
	}
	public void setBenefit(String benefit) {
		this.benefit = benefit;
	}
	
	public String toString() {
		return super.toString() + " | " + benefit;
	}
	
}
class GoldMember extends Member {
	private int bonus;
	
	public GoldMember(int no, String name, int bonus) {
		super(no, name);
		this.bonus = bonus;
	}
	
	public int getBonus() {
		return bonus;
	}
	
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
	public String toString() {
		return super.toString() + " | " + bonus;
	}
}
/*
 문제3) 아래의 조건을 해결하고, 예외를 처리하시오.
 1. sm2에 m을 참조했을 때 발생하는 예외를 발견하고, 예외를 처리하시오.
 2. gm2에 m을 참조했을 때 발생하는 예외를 발견하고, 예외를 처리하시오.
 3. sm2에 gm을 참조했을 때 발생하는 예외를 발견하고, 예외를 처리하시오.
 
 */
/*
 < 상속에서의 캐스팅 >
 업 캐스팅(Up Casting): 자식에서 부모로 캐스팅하는 경우. 다형성을 구현
 다운 캐스팅(Down Casting): 부모에서 자식으로 캐스팅하는 경우
 */
public class ExceptionTest09 {
	public static void main(String[] args) {
		Member m = new Member(112233, "이익준");
		SpecialMember sm = new SpecialMember(445566, "김준완", "1일 무료");
		GoldMember gm = new GoldMember(778899, "채송화", 50000);
		SpecialMember sm2 = null;
		GoldMember gm2 = null;
		
		// 1. - sm2에 m을 참조했을 때 발생하는 예외
		// java.lang.ClassCastException: Member cannot be cast to SpecialMember
		// 다운 캐스팅으로 발생하는 예외
		try {
			sm2 = (SpecialMember)m;			
		} catch(ClassCastException e) {
			// e.printStackTrace();
			System.err.println("다운 캐스팅을 할 수 없습니다.");
		}
		
		// 2. - gm2에 m을 참조했을 때 발생하는 예외
		// java.lang.ClassCastException: Member cannot be cast to GoldMember
		try {
			gm2 = (GoldMember)m;			
		} catch(ClassCastException e) {
			// e.printStackTrace();
			System.err.println("다운 캐스팅을 할 수 없습니다.");
		}
		
		// 3. - sm2에 gm을 참조했을 때 발생하는 예외 -> 예외가 아니라 에러
		//sm2 = (SpecialMember)gm;
		
		System.out.println(m);
		System.out.println(sm);
		System.out.println(gm);
		System.out.println("프로그램에서 예외를 처리하고, 정상적으로 종료하였습니다.");
	}
}

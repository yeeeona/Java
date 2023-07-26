import java.util.Calendar;

class DateId {
	private static long count; //  클래스 변수
	private long id; // 인스턴스 변수
	
	// 클래스 초기자(정적 초기자)
	// 동작시점:클래스 변수가 만들어지고, 해당 클래스가 사용되는 시점
	// 목적: 특별한 식별번호 딱 1개를 생성하여 사용하고자 할 떄
	static {
		Calendar c = Calendar.getInstance();
		long year = c.get(Calendar.YEAR);
		long month = c.get(Calendar.MONTH) + 1;
		long date = c.get(Calendar.DATE);
		count = year*10000000 + month*100000 + date*1000;
	}
	// 기본 생성자
	public DateId() {
		this.id = ++count;
	}
	
	
	// getter
	// 클래스 메소드
	public static long getCount() {
		return count;
	}
	
	// 인스턴스 메소드 
	public long getId() {
		return id;
	}
}
public class DateIdTest01 {
	public static void main(String[] args) {
		DateId d1 = new DateId();
		DateId d2 = new DateId();
		DateId d3 = new DateId();
		
		System.out.println("d1' id: " + d1.getId());
		System.out.println("d2' id: " + d2.getId());
		System.out.println("d3' id: " + d3.getId());
	}

}

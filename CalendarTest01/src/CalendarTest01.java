import java.util.Calendar;

public class CalendarTest01 {
	public static void main(String[] args) {
		// Calendar c = new Calendar(); // 추상 클래스는 인스턴스를 생성할 수 없음
		Calendar c = Calendar.getInstance(); // Calendar 클래스를 사용하는 방법
		
		int year = c.get(Calendar.YEAR);
		int	month = c.get(Calendar.MONTH);
		int date = c.get(Calendar.DATE);
		System.out.println(year + "년" + month + "월" + date + "일");
		
		int hour = c.get(Calendar.HOUR);
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		int millisecond = c.get(Calendar.MILLISECOND);
		System.out.println(hour + "시" + minute + "분" + second + "초" + millisecond + "밀리초");

		// Calendar 클래스에서 추가한 기능
		System.out.println("올해의 몇번째 주: " + c.get(Calendar.WEEK_OF_YEAR));
		System.out.println("이번달의 몇번째 주: " + c.get(Calendar.WEEK_OF_MONTH));
		System.out.println("이달의 몇 일: " + c.get(Calendar.DATE));
		System.out.println("이달의 몇 일: " + c.get(Calendar.DAY_OF_MONTH));
		System.out.println("올해의 몇 일: " + c.get(Calendar.DAY_OF_YEAR));
		
		
	}

}

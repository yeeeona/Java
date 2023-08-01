import java.util.Calendar;

public class CalendarTest03 {
	public static void main(String[] args) {
		// 3. 두 날짜 사이의 차이
		Calendar c1 = Calendar.getInstance(); // 현재날짜
		Calendar c2 = Calendar.getInstance(); // 수업 종강일
		
		c2.set(2023, Calendar.NOVEMBER, 15, 18, 30, 0); // 종강
		
		long differTime = c2.getTimeInMillis() - c1.getTimeInMillis();
		System.out.println("두 날짜의 차이: " + differTime + "밀리초");
		System.out.println("두 날짜의 차이: " + differTime/1000 + "초");
		System.out.println("두 날짜의 차이: " + differTime/1000/60 + "분");
		System.out.println("두 날짜의 차이: " + differTime/1000/60/60 + "시");
		System.out.println("두 날짜의 차이: " + differTime/1000/60/60/24 + "일");
		
		

	}

}

import java.util.Calendar;

public class CalendarTest02 {

	public static void main(String[] args) {
		// 2. 날짜를 설정하는 방법
		// ex) 2023년 7월 20일 18시 30분 10초 설정 -> 여자 월드컵 개최일
		
		Calendar c = Calendar.getInstance();
		c.set(2023, 6, 20, 18, 30, 10);
		
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH) + 1; // 1을 더해서 보정
		int date = c.get(Calendar.DATE);
		//int hour = c.get(Calendar.HOUR); // 12시간제 (오후6시 -> 6)
		int hour = c.get(Calendar.HOUR_OF_DAY); // 24시간제 (오후6시 -> 18)
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		int milliSecond = c.get(Calendar.MILLISECOND);
		
		System.out.println(year +"년 " + month +"월 " + date +"일 ");
		System.out.println(hour +"시 " + minute +"분 " + second +"초 " + milliSecond +"밀리초");
		
		// < 오전 / 오후를 표시하는 방법 >
		// Calendar.AM_PM -> 0:오전, 1:오후
		int ampm = c.get(Calendar.AM_PM);
		System.out.println("am/pm: " + ampm);
		
		// 1-1. 오전/오후 선택 방법 1번 - 배열 사용
		String[] ap = {"오전", "오후"};
		System.out.println(ap[ampm] + hour +"시 " + minute +"분 " + second +"초");
		
		
		// 1-2. 오전/오후 선택 방법 2번- Calendar 클래스를 활용, switch~case문 활용
		switch(c.get(Calendar.AM_PM)) {
		case 0: System.out.print("오전"); break;
		case 1: System.out.print("오후");break;
		}
		System.out.println(" " + hour +"시 " + minute +"분 " + second +"초");
		
		// 1-3. 오전/오후 선택 방법 3번 - Calendar 클래스를 활용, switch~case문 활용, 클래스 상수를 사용
		switch(c.get(Calendar.AM_PM)) {
		case Calendar.AM: System.out.print("오전"); break;
		case Calendar.PM: System.out.print("오후");break;
		}
		System.out.println(" " + hour +"시 " + minute +"분 " + second +"초");
		
		
		// 1-4. 오전/오후 선택 방법 4번 - Calendar 클래스를 활용, if문 활용
		if(c.get(Calendar.AM_PM) == Calendar.AM)System.out.print("오전");
		else System.out.print("오후");
		System.out.println(" " + hour +"시 " + minute +"분 " + second +"초");

	}

}

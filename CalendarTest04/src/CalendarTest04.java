import java.util.Calendar;

public class CalendarTest04 {
	
	public static void printDate(Calendar c) {
		System.out.printf("%4d년 %2d월 %2d일\n", c.get(Calendar.YEAR), c.get(Calendar.MONTH)+1, c.get(Calendar.DATE));
	}

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		
		// 날짜 설정
		c.set(2023,Calendar.AUGUST, 31); // 8월 31일
		System.out.println(c.toString());
		printDate(c);
		
		// 1. add(): 년, 월, 일을 더하거나 빼는 메소드
		// - 년, 월, 일의 날짜가 자동으로 보정됨.
		
		// 1일 후
		c.add(Calendar.DATE,1); // 2023년 9월 1일
		printDate(c);
		// 3일 전
		c.add(Calendar.DATE, -3); // 2023년 8월 29일
		printDate(c);
		
		// 5개월 후
		c.add(Calendar.MONTH, 5); // 2024년 1월 29일
		printDate(c);
		// 2개월 전
		c.add(Calendar.MONTH, -2); // 2023년 11월 29일
		printDate(c);
		
		// 3년
		c.add(Calendar.YEAR, 3); // 2026년 11월 29일
		printDate(c);
		// 5년 전
		c.add(Calendar.YEAR, -5); // 2021년 11월 29일
		printDate(c);
		System.out.println("--------");
		
		// 2. roll(): 해당하는 년, 월, 일만 변경,
		c.roll(Calendar.DATE, 7); // 2021년 11월 6일
		printDate(c);
		c.roll(Calendar.DATE, -10); // 2021년 11월 26일 -> 일만 변경
		printDate(c);
		c.roll(Calendar.MONTH, 3); // 2021년 2월 26일 -> 월만 변경
		printDate(c);
		System.out.println("---------");
		
		// 3. set(), get()
		// 10일 후
		c.set(Calendar.DATE, c.get(Calendar.DATE)+10); // 26 + 10 -> 2021년 3월 8일
		printDate(c);
		// 7일 전
		c.set(Calendar.DATE, c.get(Calendar.DATE)-7); // 26 + 10 -> 2021년 3월 1일
		printDate(c);
		// 5개월 후
		c.set(Calendar.MONTH, c.get(Calendar.MONTH)+5); // 26 + 10 -> 2021년 8월 1일
		printDate(c);
	}

}

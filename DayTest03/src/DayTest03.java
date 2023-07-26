import java.util.Scanner;

// 날짜 클래스
class Day {
	// 인스턴스 변수
	private int year;
	private int month;
	private int date;
	
	// 생성자
	public Day(int year, int month, int date) {
		this.year = year;
		this.month = month;
		this.date = date;
	}
	// 생성자 오버로딩
	// 복사 생성자
	public Day(Day d) {
		this.year = d.year;
		this.month = d.month;
		this.date = d.date;
	}
	
	//  getter
	public int getYear() {
		return year;
	}
	public int getMonth() {
		return month;
	}
	public int getDate() {
		return date;
	}
	
	// setter
	public void setYear(int year) {
		this.year = year;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public void setDate(int date) {
		this.date = date;
	}
	
	public void set(int year, int month, int date) {
		this.year = year;
		this.month = month;
		this.date = date;
	}
	
	// 요일 게산 메소드
	// 제라의 공식: 날짜에 따른 요일을 0~6사이의 정수로 구하는 공식
	// 0:일, 1:월, 2:화, 3:수, 4:목, 5:금, 6:토 


	public int dayOfWeek() {
			int y = year;
			int m = month;
			int d = date;
			
			if(m ==1 || m ==2) {
				y--;
				m += 12;
			}
			return (y + y/4 - y/100 + y/400 + (13*m+8)/5 + d) % 7;
	}
	// 날짜 비교 인스턴스 메소드
	public boolean equals(Day d) {
		return this.year == d.year && this.month == d.month && this.date==d.date;
	}
}
public class DayTest03 {
	
	static boolean compareDay(Day d1, Day d2) {
		return d1.getYear() == d2.getYear() && d1.getMonth() == d2.getMonth() && d1.getDate() == d2.getDate();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] weekday = {"일", "월", "화", "수", "목", "금", "토"};
		int y, m, d;
		
		
		// 입력
		System.out.println("날짜 1을 입력하세요.");
		System.out.print("년 입력: ");
		y = sc.nextInt();
		System.out.print("월 입력: ");
		m = sc.nextInt();
		System.out.print("일 입력: ");
		d = sc.nextInt();
		Day day1 = new Day(y, m, d);
		
		System.out.println("날짜 2을 입력하세요.");
		System.out.print("년 입력: ");
		y = sc.nextInt();
		System.out.print("월 입력: ");
		m = sc.nextInt();
		System.out.print("일 입력: ");
		d = sc.nextInt();
		Day day2 = new Day(y, m, d);
		
		// 출력
		System.out.printf("%4d년 %2d월 %2d일 (%s)\n",day1.getYear(), day1.getMonth(), day1.getDate(), weekday[day1.dayOfWeek()]);
		System.out.printf("%4d년 %2d월 %2d일 (%s)\n", day2.getYear(), day2.getMonth(), day2.getDate(), weekday[day2 .dayOfWeek()]);
		sc.close();
		
		// 두 개의 날짜를 비교
		// 1번 - 잘못된 비교 방법
		// -> 값이 아니라 참조를 비교
		/*
		if(day1 == day2) {
			System.out.println("두 날짜가 같습니다.");
		} else {
			System.out.println("두 날짜가 다릅니다.");
		}
		*/
		
		// 2번 - 옳은 비교 방법
		// -> 해결책: 값을 비교
		// -> 개선점: 날짜를 비교하는 기능도 날짜 클래스 안으로 포함.
		/*
		if(compareDay(day1, day2)) {
			System.out.println("두 날짜가 같습니다.");
		} else {
			System.out.println("두 날짜가 다릅니다.");
		}
		*/
		
		// 3번 -
		// -> 해결책
		if(day1.equals(day2)) {
			System.out.println("두 날짜가 같습니다.");
		} else {
			System.out.println("두 날짜가 다릅니다.");
		}
		
		
	}

}

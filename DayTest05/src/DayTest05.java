

// 날짜 클래스
class Day {
	// 인스턴스 변수
	private int year = 2023;
	private int month = 1;
	private int date =1;
	
	// 생성지 오버로딩 - 다양한 생성자의 활용
	// 기본 생성자
	public Day() {}
	
	// 매개변수를 1개 갖는 생성자
	public Day(int year) {
		this.year = year;
	}
	
	// 매개변수를 2개 갖는 생성자
	public Day(int year, int month) {
		this.year = year;
		this.month = month;
	}
	
	// 매개변수를 3개 갖는 생성자
	public Day(int year, int month, int date) {
		this(year, month);
		this.date = date;
	}
	
	// 복사 생성자
	// this(): 생성자 안에서 자신의 생성자를 호출함
	public Day(Day d) {
		this(d.year, d.month, d.date);
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
	
	// 날짜 출력 메소드
	public String toString() {
		String[] weekday = {"일", "월", "화", "수", "목", "금", "토"};
		return String.format("%4d년 %2d월 %2d일 (%s)", year, month, date, weekday[dayOfWeek()]);
	}
}

public class DayTest05 {
	public static void main(String[] args) {
		
		Day d1 = new Day(2023, 7, 35);
		Day d2 = new Day();
		Day d3 = new Day(2020);
		Day d4 = new Day(2018, 6);
		Day d5 = new Day(d4);
		
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);
		System.out.println(d5);
	}

}

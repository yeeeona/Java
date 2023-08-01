
import java.util.Date;

// Date 클래스: Java 1.0 버전부터 사용
// Calendar 클래스: Date 클래스의 문제점을 보완하고 개선해서 만든 클래스
public class DateTest01 {
	public static void main(String[] args) {
		Date d = new Date();
		
		int year = d.getYear() + 1900; // 1900년부터 시작, 1900을 더해서 보정
		int month = d.getMonth()+ 1;// 월은 0 ~ 11까지의 값, 1을 더해서 보정
		int date = d.getDate();
		System.out.println(year + "년" + month +  "월" + date + "일");
		
		int hour = d.getHours();
		int minute = d.getMinutes();
		int second = d.getSeconds();
		System.out.println(hour + "시" + minute + "분" + second + "초");
		
		// 2. 날짜를 생성하는 방법
		// 2-1. 2023년 7월 20일 설정 -> 여자 월드컵 개최일
		Date d2 = new Date();
		d2.setYear(2023);
		d2.setMonth(6); // 월은 0~ 11까지으 값, 7월이면 6을 저장
		d2.setDate(20);
		d2.setHours(18);
		d2.setMinutes(30);
		d2.setSeconds(10);
		
		System.out.println(year + "년" + month +  "월" + date + "일");
		System.out.println(hour + "시" + minute + "분" + second + "초");
		System.out.println();
		
		// 2-2. 생성자를 사용
	      // ex) 2023년 8월 20일 21시 45분 30초 설정 -> 여자 월드컵 폐회일
	      Date d3 = new Date(2023, 7, 20, 21, 45, 30);
	      
	      year = d3.getYear();
	      month = d3.getMonth() + 1; // 월은 1을 더해서 사용
	      date = d3.getDate();
	      hour = d3.getHours();
	      minute = d3.getMinutes();
	      second = d3.getSeconds();
	      
	      System.out.println(year + "년" + month + " 월" + date + "일" + hour + "시" + minute + "분" + second + "초");
	      System.out.println("-----------");
		
		

	}

}

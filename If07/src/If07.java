
import java.util.Scanner;

public class If07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("당신의 출생년도를 입력하시오.: ");
		int year = sc.nextInt();
		
		if (2017 <= year && year>=2023) {
			System.out.println(year + "년에 태어난 당신은 골드베이비세대입니다.");
			System.out.println("외동으로 태어나 외로움을 많이 탑니다..");
		} else if (1997 <= year && year>=2016) {
			System.out.println(year + "년에 태어난 당신은 Z세대입니다.");
			System.out.println("초저출산세대에 출생하였습니다.");
		} else if (1985 <= year && year>=1996) {
			System.out.println(year + "년에 태어난 당신은 밀레니얼(Y)세대입니다.");
			System.out.println("대학진학률최정점, 사회진출가속세대에 출생하였습니다.");
		} else if (1975 <= year && year>=1984) {
			System.out.println(year + "년에 태어난 당신은 X세대입니다.");
			System.out.println("중간관리자, 윗 세대 관행 거부 대에 출생하였습니다.");
		} else if (1965 <= year && year>=1774) {
			System.out.println(year + "년에 태어난 당신은 2차 베이비부머 세대입니다.");
			System.out.println("정년 연장 혜택을 누리는 세대에 출생하였습니다.");
		} else if(1955 <= year && year>=1964) {
			System.out.println(year + "년에 태어난 당신은 1차 베이비부머 세대입니다.");
			System.out.println("고령화편입 본격화세대에 출생하였습니다.");
		}
		sc.close();
	}
}

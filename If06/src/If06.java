
import java.util.Scanner;
public class If06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("월 입력: ");
		int month = sc.nextInt();
		
		if(month==3 || month==4 || month==5) {
			System.out.println(month + "월은 봄입니다");
		} else if(month==6 || month==7 || month==8) {
			System.out.println(month + "월은 여름입니다");
		} else if(month==9 || month==10 || month==11) {
			System.out.println(month + "월은 가을입니다");
		} else if(month==12 || month ==1 || month==2) {
			System.out.println(month + "월은 겨울입니다");
		} else {
			System.out.println("잘못 입력하였습니다");
		}
		
		
		
		sc.close();
		
	}

}

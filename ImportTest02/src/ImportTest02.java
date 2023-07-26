// 1. 단일형 import
// - 패기지와 클래스의 이름까지 모두 import 하는 방법
// - 장점 : 사용하는 클래스를 명확하게 파악할 수 있음.
// - 단점 : 사용하는 클래스가가 많아지면 복잡해짐.
//import java.util.Scanner;
//import java.util.Random;

// 2. 주문형(on-demand) import 
// - 패키지 이름.*로 해당 패키지에서 사용하는 클래스를 모두 import하는 방법
// - 장점 : 간결한 처리
// - 단점 : 클래스의 사용을 정확하게 파악하기 어려움
import java.util.*;

public class ImportTest02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		System.out.print("행운의 수 입력(0~9): ");
		int n = sc.nextInt();
		
		int rn = r.nextInt(10);
		
		if(n==rn) {
			System.out.println("오늘은 행운의 날입니다.");
		} else {
			System.out.println("오늘은 평범한 날입니다.");
		}
		
		sc.close();
		r.doubles();
	}
}

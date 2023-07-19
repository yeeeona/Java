
// 퀴즈1번) 문자를 계속 입력하여, 입력한 문자들에서 소문자의 개수와 대문자의 개수를 판별하시오.
// 0을 입력하면 반복을 끝마치도록 하시오.

// 아스키 코드: A: 65, a: 97 => 07,08 do~while문이나 무한루프를 사용하여 풀이
import java.util.Scanner;

public class Loop08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int upper = 0, lower = 0, chk;
		
		do {
			System.out.print("대소문자 중에서 1문자를 입력하시오.: ");
			char c = sc.next().charAt(0);
			
			if(c>='A' && c<='Z') {
				++upper;
			} else if(c>='a' && c<='z') {
				++lower;
			} else {
				System.out.println("영문자가 아닙니다. 다시 입력하세요.");
			}
			
			System.out.print("계속하시겠습니까? (0:종료, 1:계속): ");
			chk = sc.nextInt();
			
		} while(chk != 0);
		
		System.out.println("대문자 개수: " + upper);
		System.out.println("소문자 개수: " + lower);
		
		sc.close();
	}
}

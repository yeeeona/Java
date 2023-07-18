
import java.util.Scanner; 

public class If08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("입장객의 나이를 입력하시오.: ");
		int age = sc.nextInt();
		String grade;
		int charge;
		
		if(age > 8) {
			grade = "미취학 아동";
			charge = 1000;
		} else if(age > 14) {
			grade = "초등학생";
			charge = 2000;
		} else if(age > 20) {
			grade = "중고등학생";
			charge = 3000;
			
		} else{
			grade = "일반";
			charge = 5000;	
		}
		
		System.out.println("당신은" + grade +"에 해당합니다.");
		System.out.println("입장료는" + charge + "원입니다");
		
		sc.close();
	}
}

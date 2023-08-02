
/*
 * Wrapper 클래스
 1. Wrapper 클래스가 존재하지는 않음.
 2. 기본 데이터타입 8가지(byte, short, int long, float, double, char, boolean)에 대한 클래스 8개를 통칭해서 일컫는 말
 3. Byte, Short, Integer, Long, Float, Double, Character, Boolean
 4. 목적1: 기본형을 객체형으로 변환하여 자바의 세상에서 사용하기 위함.
 5. 목적2: 문자열을 기본형으로 만들어 사용하기 위함. 
 */

// 박싱(Boxing): 기본형을 객체형으로 만드는 것.
// 언박싱(unboxing): 객체혀을 기본형으로 만드는 것
// 오토박승(Auto-Boxing): 기본형의 객체형으로 만들 때 자동으로 만드는 것
public class WrapperTest01 {
	public static void main(String[] args) {
		int i = 10; // 기본형
		Integer ii = new Integer(i); // 객체형, 박싱(Boxing)
		
		int i2 = ii.intValue(); // 언박싱(unboxing)
		i2 += 20;
		System.out.println(i2);
		System.out.println("-------");
		
		int j = 10; // 기본형
		Integer jj = j;// 객체형, 오토박싱(Auto-Boxing)
		
		int j2 = jj += 20; // 오토언박싱(Auto-UnBoxing)
		System.out.println(j2);
		System.out.println("------");
		
		String s1 = "10";
		// int a = s1 + 20; // 에러
		int a = Integer.parseInt(s1) + 20;
		System.out.println(a);
		System.out.println("------");
		
		String s2 = "3.14";
		double area = Double.parseDouble(s2) * 5.5 * 5.5;
		System.out.println(area);
		System.out.println("----");
		
		String s3 = "3000000000L";
		Double money = Long.parseLong(s3) + Long.parseLong(s3)*0.01;
		System.out.println(money);
		
		
		

	}

}

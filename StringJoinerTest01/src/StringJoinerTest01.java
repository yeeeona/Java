import java.util.StringJoiner;

public class StringJoinerTest01 {

	public static void main(String[] args) {
		String animals = "사자/표범/치타/코끼리/기린/하마/얼룩말/누";
		String[] a = animals.split("/");
		for(String s : a) {
			System.out.println(s);
		}
		System.out.println("-----");
		
		// 새로운 구분자로 연결하여 문자열 생성
		// 1. String 클래스의 join() 메소드로 연결
		String animals2 = String.join("-", a);
		System.out.println(animals2);
		
		// 2. StringJoiner 클래스를 사용
		StringJoiner sj = new StringJoiner(",");
		for(String s : a) {
			sj.add(s);
		}
		String str = sj.toString();
		System.out.println(sj);
		System.out.println(str);
		System.out.println("--------");
		
		// 3. StringJoiner 클래스를 사용
		StringJoiner sj2 = new StringJoiner(",", "[", "]");
		for(String s : a) {
			sj2.add(s);
		}
		String str2 = sj2.toString();
		System.out.println(sj2);
		System.out.println(str2);

	}

}


public class StringTest01 {
	public static void main(String[] args) {
		String s1 = "ABC";
		String s2 = "XYZ";
		String s3 = "ABC";
		String s4 = "DEF";
		
		s4 = s1; // s1과 같은 곳을 참조, s4가 참조하던 값을 Garbage Data가 됨, JVM이 회수해서 재활용함.
		
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println("-----");
		
		// 해시코드(hashcode) - 각 인스턴스가 가지는 고유한 아이디
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
	}

}

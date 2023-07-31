
public class StringTest05 {
	public static void main(String[] args) {
		String s1 = null; // null: 아무곳도 참조하지 않는다.
		String s2 = ""; // 빈 문자열
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println("---------");
		//System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println("------");
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		
		char[] c = new char[] {'H', 'e', 'l', 'l', 'o'};
		System.out.println(c);
		
		String s3 = new String(c);
		System.out.println(s3);
	}
}

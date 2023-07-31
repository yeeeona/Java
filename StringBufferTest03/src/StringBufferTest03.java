
public class StringBufferTest03 {

	public static void main(String[] args) {
		String s1 = "ABC";
		// s1 =+ "DEF";
		s1 = s1.concat("DEF");
		System.out.println("-------");
		
		// append(): 문자열을 추가하는 메소드
		StringBuffer sb1 = new StringBuffer("ABC");
		sb1.append("DEF");
		System.out.println(sb1);
		sb1.append("XYZ").append('c').append("Hello"); // 메소드 체이닝
		System.out.println(sb1);
		System.out.println("-----");
		
		// 3. capacity(): 용량을 알려주는 메소드
		// 4. length(): 길이를 알려주는 메소드
		StringBuffer sb2 = new StringBuffer();
		System.out.println("초기용량: " + sb2.capacity()); // 16
		System.out.println("크기: " + sb2.length()); // 0
		sb2.append("Hello Java World");
		System.out.println("추가 후 용량: " + sb2.capacity()); // 16
		System.out.println("추가 후 크기: " + sb2.length());
		sb2.append("Java"); 
		System.out.println("추가 후 용량: " + sb2.capacity() ); // 34 -> 18
		System.out.println("추가 후 크기: " + sb2.length() ); // 20
		System.out.println("--------");
		
		StringBuffer sb3 = new StringBuffer(10);
		System.out.println("초기 용량: " + sb3.capacity());

	}

}

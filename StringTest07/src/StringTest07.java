
public class StringTest07 {
	public static void main(String[] args) {
		String s1 = "Hello_Java_World.hwp";
		
		// 4. endWith(): 문자열이 특정 문자(열)로 끝나는지를 파악하는 메소드
		System.out.println(s1.endsWith(".txt"));
		System.out.println(s1.endsWith(".hwp"));
		
		if(s1.endsWith(".txt")) {
			System.out.println("정상적으로 업로드 되었습니다.");
		} else {
			System.out.println("파일형식을 txt로 변환하여, 다시 업로드 해주세요.");
		}
		
		// 5. startWith(): 문자열이 특정 문자(열)로 시작하는지를 파악하는 메소드
		System.out.println(s1.startsWith("Hello"));
		System.out.println(s1.startsWith("hello"));
		
		// 6. indexOf(): 문자열에서 특정 문자(열)의 인덱스를 찾는 메소드 
		System.out.println(s1.indexOf("J"));
		System.out.println(s1.indexOf("Java"));
		System.out.println(s1.indexOf("java")); // -1, 해당 문자(열)을 찾지 못했을 때
		
		// 7. lastIndexOf(): 문자열에서 특정 문자(열) 인덱스를 뒤에서부터 찾는 메소드
		String s2 = "java.object.java.txt";
		System.out.println(s2.indexOf(".")); // 일치하는 데이터를 앞에서부터 찾음
		System.out.println(s2.lastIndexOf(".")); // 일치하는 데이터를 뒤에서부터 찾음
		System.out.println(s2.indexOf("java")); // 0
		System.out.println(s2.lastIndexOf("java")); // 12
	}

}

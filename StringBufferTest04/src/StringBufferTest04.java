
public class StringBufferTest04 {
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer();
		
		// append(): 문자열을 뒤에서 추가하는 메소드 
		sb1.append("Helloo Java World");
		sb1.append("Android");
		System.out.println(sb1);
		
		// charAt(): 인덱스에 해당하는 한 문자를 리턴하는 메소드
		char c1 = sb1.charAt(6);
		System.out.println(c1);
		char c2 = sb1.charAt(11);
		System.out.println(c2);
		
		// deleteCharAt(): 인덱스에 해당하는 한 문자를 삭제하는 메소드
		sb1.deleteCharAt(11);
		System.out.println(sb1);
		
		// delete(): 범위에 해당하는 문자열을 삭제하는 메소드
		sb1.delete(6, 10); // 6번에서 10번 앞까지(9번) 삭제
		System.out.println(sb1);
		
		// insert(): 특정 위치에 해당 문자(열)을 추가하는 메소드
		sb1.insert(7, "W");
		System.out.println(sb1);
		sb1.insert(6, "Java");
		System.out.println(sb1);
		
		// replace(): 특정 위치의 문자(열)을 해당 문자(열)로 변경하는 메소드
		sb1.replace(6, 10, "Spring");
		System.out.println(sb1);
		
		// reverse(): 문자열을 거꾸로 뒤집어 주는  
		sb1.reverse();
		System.out.println(sb1);
		sb1.reverse();
		System.out.println(sb1);
		
		// setCharAt():특정 위치의 1문자를 변경하는 메소드 
		
		// length(): 문자열의 길이를 반환하는 메소드 
		
		// setLength(): 문자열의 길이를 변경하는 메소드, 요량은 변경되지 않
		
	}

}

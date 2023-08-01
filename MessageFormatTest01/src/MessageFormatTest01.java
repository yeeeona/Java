import java.text.MessageFormat;

public class MessageFormatTest01 {

	public static void main(String[] args) {
		String id = "j123456";
		String name = "남궁민";
		String tel = "010-1111-2222";
		
		// 1번 방법
		String txt = "아이디: {0}, 이름: {1}, 전화번호: {2}";
		String result1 = MessageFormat.format(txt, id, name, tel);
		System.out.println(result1);
		
		// 2번 방법
		String sq1 = "insert intp member values({0}, {1}, {2})";
		Object[] obj = {"j987654", "안은진", "010-3333-6666"};
		String result2 = MessageFormat.format(sq1, obj);
		System.out.println(result2);
		
		
		
		

	}

}

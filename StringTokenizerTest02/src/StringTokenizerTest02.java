import java.util.StringTokenizer;

public class StringTokenizerTest02 {
	public static void main(String[] args) {
		String birds = "송골매/황조롱이/대머리독수리/산까치,까마귀,부엉이,올뺴미,참수리";
		
		StringTokenizer st = new StringTokenizer(birds, "/,", true);
		System.out.println("토근의 수: " + st.countTokens());
		
		while(st.hasMoreTokens()) {
			String s = st.nextToken();
			System.out.println(s);
		}
		System.out.println("출력 후 토근의 수: " + st.countTokens());
	}
}

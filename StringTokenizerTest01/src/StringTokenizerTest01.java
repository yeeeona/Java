import java.util.StringTokenizer;

public class StringTokenizerTest01 {

	public static void main(String[] args) {
		String animals = "lion,cheetah,leopard,hyena,elephant,hippo,giraffe";
		
		String[] a = animals.split(",");
		
		// 1. split()
		for(int i=0; i<a.length; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
		}
		
		// StringTokenizer 클래스
		StringTokenizer st = new StringTokenizer(animals,",");
		System.out.println("토근의 수: " + st.countTokens());
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		System.out.println("------");
		
		String animals2 = "lion,cheetah,leopard,hyena,elephant/hippo/giraffe";

		
		// 2. StringTokenizer 클래스
		StringTokenizer st2 = new StringTokenizer(animals2, ",./"); 
		System.out.println("토큰의 수: " + st2.countTokens());
		while(st2.hasMoreTokens()) {
			System.out.println(st2.nextToken());
		}
		System.out.println("-----");
		
		// 문제1) animals2 문자열의 동물을 구분하여 배열로 저장하고, 출력하시오. 동물의 수도 구하시오
		// 1. split():
		String[] a2 = animals2.split(",|/");
		for(int i=0; i<a2.length; i++) {
			System.out.println("a[" + i + "] = " + a2[i]);
		}

		System.out.println("동물의 수: " + a2.length + "마리");
		
		
	}

}

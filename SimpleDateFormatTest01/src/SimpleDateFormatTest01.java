import java.text.DecimalFormat;

public class SimpleDateFormatTest01 {

	public static void main(String[] args) {
		double n = 1234567.89;
		
		// DecimalFormat 클래스의 숫자 출력 형식 지정
		// #
		// 0
		DecimalFormat df1 = new DecimalFormat("#,###.####");
		DecimalFormat df2 = new DecimalFormat("0,000.0000");
		DecimalFormat df3 = new DecimalFormat("#,###,###,###");
		DecimalFormat df4 = new DecimalFormat("0,000,000,000");
		DecimalFormat df5 = new DecimalFormat("#,###.##"); // 보편적인 방법
		DecimalFormat df6 = new DecimalFormat("#,#E0"); // 지수승
		
		
		// 출력
		System.out.println(df1.format(n));
		System.out.println(df2.format(n));
		System.out.println(df3.format(n));
		System.out.println(df4.format(n));
		System.out.println(df5.format(n));
		System.out.println(df6.format(n));
		

	}

}

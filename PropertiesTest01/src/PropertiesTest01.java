import java.util.Enumeration;
import java.util.Properties;

/*
 Properties
 - Map의 개념을 문자열에 특화시킨 클래스
 - 데이터는 키와 값의 쌍으로 구성됨. 키와 값이 모두 문자열로 구성됨.
 - 따로 제러릭 부분을 명시하지 않는다.
   
 */


public class PropertiesTest01 {
	public static void main(String[] args) {
		Properties prop = new Properties();
		
		prop.setProperty("이익준", "간담췌외과");
		prop.setProperty("김준완", "흉부외과");
		prop.setProperty("채송화", "신경외과");
		prop.setProperty("양석형", "산부인과");
		prop.setProperty("안정원", "소아외과");
		
		// 확인1
		System.out.println(prop);
		
		// 확인2
		prop.list(System.out);
		
		// 출력1
		Enumeration e = prop.propertyNames();
		while(e.hasMoreElements()) {
			String name = (String)e.nextElement();
			String major = prop.getProperty(name);
			System.out.println("교수명: " + name + ", 전공: " + major);
		}
		

	}

}

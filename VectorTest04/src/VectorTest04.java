import java.util.Vector;

public class VectorTest04 {

	public static void main(String[] args) {
		Vector<Integer> v1 = new Vector<>();
		Vector<Integer> v2 = new Vector<>();
		Vector<Integer> v3 = new Vector<>();
		
		v1.add(10); v1.add(20); v1.add(30);
		v1.add(40); v1.add(50); v1.add(60);
		v1.add(30); v1.add(40); v1.add(50);
		
		System.out.println("v1: " + v1);
		System.out.println("v2: " + v2);
		System.out.println("v3: " + v3);
		System.out.println("----");
		
		System.out.println("-- 벡터에 따른 벡터의 모든 값을 추가 --");
		v1.addAll(1, v2);
		System.out.println("v1: " + v1);
		
		System.out.println(" -- 벡터에서 값의 존재 유무 --");
		System.out.println(v1.indexOf(50));
		System.out.println(v1.indexOf(90));
		
		System.out.println(v1.contains(50));
		System.out.println(v1.contains(90));
		
		System.out.println("-- 벡터에서 다른 벡터의 모든 데이터의 존재 유무 --");
		System.out.println(v1.contains(v2));
		System.out.println(v2.contains(v3));
	}

}
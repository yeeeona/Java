import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

// < HashSet 과 TreeSet의 비교 > 
// HashSet: 데이터의 추가/삭제가 빠름, 일반적인 검색이 빠름
// TreeSet: 데이터의 추가/삭제가 느림, 오름차순으로 되어있어 특정 부분에 대한 검색이 빠름
// 
public class TreeSetTest06 {
	public static void main(String[] args) {
		Set<Integer> set1 = new HashSet<>();
		
		int n;
		for(int i=0; set1.size()<6; i++) {
			n = (int)(Math.random()* 45) + 1;
			set1.add(n);
		}
		System.out.println("HashSet: " + set1);
		
		Set<Integer> set2 = new TreeSet<Integer>();
		for(int i=0; set2.size()<6; i++) {
			n = (int)(Math.random() * 45) + 1;
			set2.add(n);
		}
		System.out.println("TreeSet: " + set2);
	}
}

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

class Student {
	private int sno;
	private String sname;
	
	public Student(int sno, String sname) {
		this.sno = sno;
		this.sname = sname;
	}
	
	// getter
	public int getSno() {
		return sno;
	}
	public  String getSname() {
		return sname;
	}
	
	// setter
	public void setSno(int sno) {
		this.sno = sno;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	
	@Override
	public String toString() {
		return sno + "(" + sname + ")";
	}
	
	@Override
	public int hashCode() {
		return (sno+sname).hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student s = (Student)obj;
	        return this.sno == s.sno && this.sname.equals(s.sname);
	    }
		return false;
	}

}
/*
 문제1) 아래의 조건에 따라 HashMap을 생성하고, 활용하시오.
 1. 키를 Student로 하고, 값을 score로 하는 HashMap인 map을 생성하시오.
 2. 맵에 5명의 학생 정보를 추가히시오.
 3. 키와 값의 중복을 확인하시오.
 4. 3가지의 출력 방법으로 출력하시오.
 */
public class HashMapTest04 {
	public static void main(String[] args) {
		// 1. 맵 생성, 키: Student, 값 Integer
		HashMap<Student, Integer> map = new HashMap<>();
		
		// 2. 데이터 추가
		map.put(new Student(123456,"이익준"), 95);
		map.put(new Student(123457,"김준완"), 88);
		map.put(new Student(123458,"채송화"), 77);
		map.put(new Student(123459,"양석형"), 85);
		map.put(new Student(123460,"안정원"), 66);
		System.out.println(map);
		
		// 3. 값 중복 확인
		map.put(new Student(112233,"장겨울"), 88);
		System.out.println(map);
		System.out.println("크기: " + map.size());
		
		// 4-1. 키 중복 확인 - 학번 -> 허용
		map.put(new Student(123460, "도재학"), 75);
		System.out.println(map);
		System.out.println("크기: " + map.size());
		
		// 4-2. 키 중복 확인 - 이름 -> 허용
		map.put(new Student(334455,"채송화"), 90);
		System.out.println(map);
		System.out.println("크기: " + map.size());
		
		// 4-3. 키 중복 확인 - 학번 & 이름 -> 허용 -> 문제점 발현
		// 문제점: 키로 사용된 인스턴스의 멤버가 모두 같으면 같은 회원 정보라고 판단해야함.
		// 해결책: Object로부터 상속받은 hashCode(), equals() 메소드를 오버라이딩하여 사용해여함.
		map.put(new Student(123459,"양석형"), 90);
		System.out.println(map);
		System.out.println("크기: " + map.size());
		
		// 5-1. keySet, Iterator
		Set<Student> keySet = map.keySet();
		Iterator<Student> it = keySet.iterator();
		while(it.hasNext()) {
			Student s = it.next();
			int score = map.get(s);
			System.out.println("학생정보: " + s + ", 점수: " + score);
		}
		System.out.println("------");
		
		// 5-2. entrySet, Iterator
		Set<Entry<Student, Integer>> entrySet = map.entrySet();
		Iterator<Entry<Student, Integer>> it2 = entrySet.iterator();
		while(it2.hasNext()) {
			Entry<Student, Integer> e = it2.next();
			Student s = e.getKey();
			int score = e.getValue();
			System.out.println("학생정보= " + s + ", 점수=" + score);
		}
		System.out.println("-------");
		
		// 5-3. entrySet, 확장 for
		Set<Entry<Student, Integer>> entrySet2 = map.entrySet();
		for(Entry<Student, Integer> e : entrySet2) {
			Student s = e.getKey();
			int score = e.getValue();
			System.out.println("학생정보: " + s + ", 점수: " + score);
		}
		System.out.println("------");
		
		// 5. 123460 학생의 이름을 허선빈으로 변경하시오.
		it = keySet.iterator();
		while(it.hasNext()) {
			Student s = it.next();
			if(s.getSno() == 123460) {
				s.setSname("허선빈");
			}
		}
		System.out.println(map);
		System.out.println("크기: " + map.size());
		
		// 6. 이익준 학생의 점수를 98으로 변경하시오.
		it = keySet.iterator();
		while(it.hasNext()) {
			Student s = it.next();
			if(s.getSname().equals("이익준")) {
				map.put(s, 98);
			}
		}
		System.out.println(map);
		System.out.println("크기: " + map.size());
		
		// 7. 123457 학생의 데이터를 삭제하시오.
		Student ds = null;
		it = keySet.iterator();
		while(it.hasNext()) {
			Student s = it.next();
			if(s.getSno() == 123457) {
				ds = s;
			}
		}
		map.remove(ds);
		System.out.println(map);
		System.out.println("크기: " + map.size());
		
	}

}

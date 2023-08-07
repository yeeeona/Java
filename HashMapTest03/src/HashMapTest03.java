import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

class Member {
	private int sno; // 회원번호
	private String sname; // 회원이름
	private int age; // 회원나이
	
	public Member(int sno, String sname, int age) {
		this.sno = sno;
		this.sname = sname;
		this.age = age;
	}
	
	public int getSno() {
		return sno;
	}
	public String getSname() {
		return sname;
	}
	public int getAge() {
		return age;
	}
	
	public void setSno(int sno) {
		this.sno = sno;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString() {
		return sno + ": " + sname + "(" + age + ")";
	}
	
}

public class HashMapTest03 {
	public static void main(String[] args) {
		// 1. 맵 생성, 키: 전화번호, 값: 회원 인스턴스
		HashMap<String, Member> map = new HashMap<>();
		
		// 2. 데이터 추가 - 순서가 없다.
		map.put("010-1111-1111", new Member(123456, "이익준", 35));
		map.put("010-2222-2222", new Member(123457, "김준완", 36));
		map.put("010-3333-3333", new Member(123458, "채송화", 37));
		map.put("010-4444-4444", new Member(123459, "양석형", 38));
		map.put("010-5555-5555", new Member(123460, "안정원", 39));
		System.out.println(map);
		
		// 3. 중복 키 확인 - 중복키는 허용 불가
		// 중복키에 대해서 새로운 값으로 덮어 씀, 키에 대한 값의 수정
		map.put("010-1111-1111", new Member(987654, "도재학", 30));
		System.out.println(map);
		System.out.println("크기: " + map.size());
		
		// 4. 중복 값 확인 - 중복값은 허용함
		map.put("010-6666-6666", new Member(123458, "채송화", 37));
		System.out.println(map);
		System.out.println("크기: " + map.size());
		
		// 5-1. 010-2222-2222 데이터를 추가하시오. (112233, "추민하", 32)
		// 5-2. 010-7777-7777 데이터를 추가하시오. (998877, "장겨울", 31)
		// 전화번호가 있으면 변경하고, 없으면 추가하시오.
		if(map.put("010-2222-2222", new Member(112233, "추민하", 32)) != null) {
			System.out.println("010-2222-2222" + "의 회원정보를 변경하였습니다.");
		} else {
			System.out.println("010-2222-2222" + "의 회원정보를 추가하였습니다.");
		}
		
		if(map.put("010-7777-7777", new Member(998877, "장겨울", 31))!= null) {
			System.out.println("010-7777-7777" + "의 회원정보를 변경하였습니다.");
		} else {
			System.out.println("010-7777-7777" + "의 회원정보를 추가하였습니다.");
		}
		
		// 6. 010-3333-3333의 데이터를 삭제하시오.
		if(map.remove("010-3333-3333") != null) {
			System.out.println("010-3333-3333" + "의 회원정보가 삭제되었습니다.");
		} else {
			System.out.println("010-3333-3333" + "의 회원정보는 존재하지 않습니다.");
		}
		System.out.println(map);
		System.out.println("크기: " + map.size());
		System.out.println("-----");
		
		// 7. 010-4444-4444의 값 중에서 이름을 허선빈, 나이를 28로 수정하시오.
		Set<String> kS = map.keySet();
		Iterator<String> it = kS.iterator();
		while(it.hasNext()) {
			String tel = it.next();
			if(tel.equals("010-4444-4444")) {
				Member m = map.get(tel);
				m.setSname("허선빈");
				m.setAge(28);
			}
		}
		System.out.println(map);
		System.out.println("크기: " + map.size());
		System.out.println("-----");
		
		// 8-1. keySet, Iterator
		Set<String> keySet = map.keySet();
		Iterator<String> ite = keySet.iterator();
		while(ite.hasNext()) {
			String tel = ite.next();
			Member m = map.get(tel);
			System.out.println("전화번호: " + tel + ", 회원정보: " + m);
		}
		System.out.println("-----");
		
		// 8-2. entrySet, Iterator
		Set<Entry<String, Member>> entrySet = map.entrySet();
		Iterator<Entry<String, Member>> it2 = entrySet.iterator();
		while(it2.hasNext()) {
			Entry<String, Member> e = it2.next();
			String tel = e.getKey();
			Member m = e.getValue();
			System.out.println("전화번호= " + tel + ", 회원정보= " + m);
		}
		System.out.println("------");
		// 8-3. entrySet, 확장 for문
		Set<Entry<String, Member>> entrySet2 = map.entrySet();
		for(Entry<String, Member> e : entrySet2) {
			String tel = e.getKey();
			Member m = e.getValue();
			System.out.println("전화번호: " + tel + ", 회원정보: " + m);
		}
		System.out.println("-------");
		
		
		
	}

}

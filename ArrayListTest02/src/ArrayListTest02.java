import java.util.ArrayList;
import java.util.Iterator;

class Member {
	private String no; // 회원 번호
	private String name; // 회원 이름
	private int age; // 나이
	
	// 생성자
	public Member(String no, String name, int age) {
		this.no = no;
		this.name = name;
		this.age = age;
	}
	
	// getter
	public String getNo() {
		return no;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	// setter
	public void setNo(String no) {
		this.no = no;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	// toString()
	@Override
	public String toString() {
		return no + "(" + name + "):" + age;
	}
	
}

// CRUD: C(create):추가, R(read):출력, U(update):수정(변경), D(delete):삭제
public class ArrayListTest02 {
	public static void main(String[] args) {
		// 1. 리스트 생성
		ArrayList<Member> list = new ArrayList<Member>();
		
		// 2. 리스트에 데이터 추가 - 순차적 추가
		//Member m1 = new Member("123456", "이익준", 40);
		//list.add(m1);
		
		list.add(new Member("123456", "이익준", 40));
		list.add(new Member("123457", "양석형", 41));
		list.add(new Member("123458", "김준완", 42));
		list.add(new Member("123459", "안정원", 43));
		list.add(new Member("123460", "채송화", 39));
		
		// 확인
		System.out.println(list.toString());
		
		// 3. 순차적 추가 - 맨 뒤에 장겨울 데이터를 추가
		list.add(new Member("987654", "장겨울", 35));
		System.out.println(list);
		
		// 4. 비순차적 추가 (중간에 추가) - 양석형 뒤에 추민하 데이터를 추가
		/*
		list.add(2, new Member("112233", "추민하", 37));
		System.out.println(list);
		*/
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getName().equals("양석형")) {
				list.add(i+1, new Member("112233", "추민하", 37));
			}
		}
		System.out.println(list);
		
		// 5. 데이터 변경 - 안정원의 나이를 38로 변경
		/*
		Member m = list.get(4);
		m.setAge(38);
		System.out.println(list);
		*/
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getName().equals("안정원")) {
				list.get(i).setAge(38);
			}
		}
		System.out.println(list);
		
		// 5-1. 회원번호 987654인 회원의 이름을 도재학으로 변경하시오.
		// 완료시간: 3분
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getNo().equals("987654")) {
				list.get(i).setName("도재학");
			}
		}
		System.out.println(list);
		
		// 6. 데이터 삭제 - 김준완 데이터를 삭제
		/*
		list.remove(3);
		System.out.println(list);
		*/
		for(int i=list.size()-1; i>=0; i--) {
			if(list.get(i).getName().equals("김준완")) {
				list.remove(i);
			}
		}
		System.out.println(list);
	
		// 출력1
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("-----");
		
		// 출력2
		for(Member m : list) {
			System.out.println(m);
		}
		System.out.println("-----");
		
		// 출력3
		Iterator<Member> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	
	}
}

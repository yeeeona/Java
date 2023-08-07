package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

import member.Member;
import member.SpeicialMember;

public class TreeSetTest08 {
	public static void main(String[] args) {
		// 셋 생성
		TreeSet<Member> set = new TreeSet<>();
		
		// 데이터 추가
		set.add(new Member(35,"이익준", "010-1234-5678",38));
		set.add(new SpeicialMember(4,"채송화", "010-1234-5679",37, "주차무료"));
		set.add(new Member(2,"안정원", "010-1234-5680",40));
		set.add(new SpeicialMember(82,"추민하", "010-1234-5681",35, "10% 할인"));
		set.add(new Member(23,"장겨울", "010-1234-5682",34));
		set.add(new SpeicialMember(4,"양석형", "010-1234-5683",39, "5종 쿠폰 발급"));
		System.out.println(set);
		
		// 중복 데이터 (회원번호 기준 정렬)
		set.add(new Member(2, "도재학", "010-1235-6789", 29)); // 회원번호 중복 -> 비허용
		set.add(new Member(96, "이익준", "010-1235-6790", 28)); // 이름 중복 -> 허용
		set.add(new Member(97, "김준완", "010-1234-5678", 49)); // 전화번호 중복 -> 허용
		set.add(new Member(98, "김건", "010-1237-6890", 29)); // 나이 중복 -> 허용
		set.add(new SpeicialMember(99, "이우주", "010-1257-5678", 34, "주차무료")); // 특별혜택 중복 -> 허용
		System.out.println(set);
		
		// 데이터 변경 - 김건의 전화번호를 010-1111-2222로 변경
		// 확장 for문
		for(Member m : set) {
			if(m.getName().equals("김건")) {
				m.setTel("010-1111-2222");
			}
		}
		System.out.println(set);
		
		// 데이터 변경 채송화의 나이를 38로 변경
		// Iterator
		Iterator<Member> it = set.iterator();
		while(it.hasNext()) {
			Member m = it.next();
			if(m.getName().equals("채송화")) {
				m.setAge(38);
			}
		}
		System.out.println(set);
		
		// 데이터 삭제 - 나이가 38살인 회원 정보 삭제
		ArrayList<Member> mList = new ArrayList<>();
		for(Member m : set) {
			if(m.getAge() == 38) {
				mList.add(m);
			}
		}
		
		for(Member m : mList) {
			set.remove(m);
		}
		System.out.println(set);
		System.out.println("--------");
		
		// 데이터 출력
		// 1. 확장 for문
		for(Member m: set) {
			System.out.println(m);
		}
		System.out.println("---------");
		
		// 2. Iterator
		Iterator<Member> ite = set.iterator();
		while(it.hasNext()) {
			System.err.println(ite.next());
		}
	}

}

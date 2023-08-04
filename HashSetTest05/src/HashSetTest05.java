import java.util.HashSet;

class Student {
	private String sno; // 학번
	private String sname; // 학생이름
	
	public Student(String sno, String sname) {
		this.sno = sno;
		this.sname = sname;
	}
	
	// getter
	public String getSno() {
		return sno;
	}
	public String getSname() {
		return sname;
	}
	
	// setter
	public void setSno(String sno) {
		this.sno = sno;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	
	public String toString() {
		return sno + "(" + sname + ")";
	}
	
	// hashCode(오버라이딩)
	@Override
	public int hashCode() {
		return (sno+sname).hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student s = (Student) obj;
			return this.sno.equals(s.sno) && this.sname == s.sname;
		}
		return false;
	}
	
	
}

/*
 문제1) 아래의 조건에 따라, Student 클래스를 완성하고, Student의 인스턴스를 저장하는 HashSet인 set을 만들어 활용하시오
 1. Student 클래스를 완성하시오.
 - 생성자, getter/setter, toString()
 2. student의 인스턴스를 저장하는 HashSet인 set을 생성하시오.
 3. 셋 5명의 학생을 추가하시오.
 4. 중복 데이터의 허용 여부를 단계별로 확인하시오.
 
 */
public class HashSetTest05 {
	public static void main(String[] args) {
		
		// set
		HashSet<Student> set = new HashSet<>();
		
		// set에 데이터 추가
		set.add(new Student("123456", "나연아"));
		set.add(new Student("123457", "윤희수"));
		set.add(new Student("123458", "정지웅"));
		set.add(new Student("123459", "정근환"));
		set.add(new Student("123460", "안중건"));
		System.out.println(set);

		// 중복 데이터 추가 - 이름만 중복
		set.add(new Student("123455", "나연아"));
		System.out.println(set);
		System.out.println("크기: " + set.size());
		
		// 중복 데이터 추가 - 학번만 중복
		set.add(new Student("123456", "박보영"));
		System.out.println(set);
		System.out.println("크기: " + set.size());
		
		// 이름과 학번 모두 중복
		set.add(new Student("123456", "나연아"));
		System.out.println(set);
		System.out.println("크기: " + set.size());
		
		
		
		
	}

}

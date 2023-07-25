/*
 퀴즈1) 주변의 사물들 중애서 1개를 클래스로 설정하고, 사용하시오.
 1. 멤버변수: 3개 이상
 2. 생성자: 기본 생성자, 매개변수로 초기화하는 생성ㅂ자 모두 생성하고 사용
 3. 멤버메소드: getter, setter, 출력메소드
 4. 인스턴스 5개 생성(1개는 getter, setter 사용)
 5. 4번이 완료되면 인스턴스를 배열로 만들어 사
 */

class Music {
	private int rank;
	 private String title;
	 private String singer;
	 
	 // 기본 생성자
	 public Music() {
		 
	 }
	 
	 public Music(int rank, String title, String singer) {
		 this.rank = rank;
		 this.title = title;
		 this.singer = singer;
	 }
	 
	 // getter
	 public int getRank() {
		 return this.rank;
	 }
	 public String getTitle() {
		 return this.title;
	 }
	 public String getSinger() {
		 return this.singer;
	 }
	 
	 // setter
	 public void setRank(int rank) {
		 this.rank = rank;
	 }
	 public void setTitle(String title) {
		 this.title = title;
	 }
	 public void setSinger(String singer) {
		 this.singer = singer;
	 }
	 
	 public void printInfo() {
		 System.out.println("차트순위: " + rank + " 노래제목: " + title + " 가수명: " + singer);
	 }
}

public class Yeona_0724 {
	public static void main(String[] args) {
		Music s1 = new Music(1, "Super Shy", "New Jeans");
		Music s2 = new Music(27, "Broken Melodies", "NCT DREAM");
		Music s3 = new Music(63, "Cream Soda", "EXO");
		Music s4 = new Music(9, "Steal The Show", "Lauv");
		Music s5 = new Music();
		
		s1.printInfo();
		s2.printInfo();
		s3.printInfo();
		s4.printInfo();
		
		// setter
		s5.setRank(62);
		s5.setTitle("Dangerously");
		s5.setSinger("Charlie Puth");
		
		// getter
		System.out.println("차트순위: " + s5.getRank() + " 노래제목: " + s5.getTitle() + " 가수명: " + s5.getSinger());
		
	}

}

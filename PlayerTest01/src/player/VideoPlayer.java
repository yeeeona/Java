package player;

// 클래스 VideoPlaye는 인터페이스 Player를 구현한다.

public class VideoPlayer implements Player{
	private static int count = 0;
	private int id;
	
	public VideoPlayer() {
		id = ++count;
	}
	
	@Override
	public void play() {
		System.out.println("* 비디오 재생 시작...");
	}
	
	@Override
	public void stop() {
		System.out.println("* 비디오 재생 종료...");
	}

	// 제조번호 출력 메소드 - 추가 메소드
	public void printInfo() {
		System.out.println("* 비디오 제조번호: " + id);
	}
	
	
}

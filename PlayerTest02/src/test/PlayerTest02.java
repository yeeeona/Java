package test;

import player.*;

public class PlayerTest02 {
	public static void main(String[] args) {
		PortablePlayer p = new PortablePlayer();
		
		p.play();
		p.stop();
		// 클래스 멤버의 사용법: 클래스명(인터페이스명), 멤버명
		p.changeSkin(Skinnable.BLACK);
	}

}

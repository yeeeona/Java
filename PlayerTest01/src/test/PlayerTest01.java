package test;

import player.*;

// 문제2) Player 인터페이스를 구현하는 클래스의 인스턴스를 2개씩 만들어, 배열에 저장하고,
// 다형성을 구현하여 출력하시오.
// 각 클래스의 특징을 가지는 메소드도 함께 출력하시오.

public class PlayerTest01 {
	public static void main(String[] args) {
		// 인터페이스는 인스턴스를 만들 수 없다.
		// Player p = new Player();
		
		// 인스턴스 배열 1번
		/*
		Player[] players = new Player[4];
		players[0] = new CDPlayer();
		players[1] = new VideoPlayer();
		players[2] = new CDPlayer();
		players[4] = new VideoPlayer();
		*/
		
		// 인스턴스 배열 2번
		Player[] players = new Player[] {
				new CDPlayer(),
				new VideoPlayer(),
				new CDPlayer(),
				new VideoPlayer(),
		};
		
		
		// 출력 1번 (기본 for문)
		
		for(int i=0; i<players.length; i++) {
			players[i].play();
			players[i].stop();
			if(players[i] instanceof CDPlayer) {
				((CDPlayer)players[i]).clean();
			}
			if(players[i] instanceof VideoPlayer) {
				((VideoPlayer)players[i]).printInfo();
			};
			System.out.println();
		}
		
		
		// 출력 2번 (확장 for문)
		/*
		for(Player p : players) {
			p.play();
			p.stop();
			if(p instanceof CDPlayer) {
				((CDPlayer)p).clean();
			}
			if(p instanceof VideoPlayer) {
				((VideoPlayer)p).printInfo();
			}
			System.out.println();
		}
		*/
	}
}

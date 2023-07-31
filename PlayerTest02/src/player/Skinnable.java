package player;

// 인터페이스명: 클래스명처럼 명사로 지정, 사물을 꾸며줄 때는 ~able을 붙여서 만든다.
public interface Skinnable {

/*
< 인터페이스 >
1. 인터페이스 안의 메소드는 오직 추상 메소드만을 갖는다
2. 인터페이스 안의 추상 메소드는 public과 abstract를 생략할 수 있다.
3. 인터페이스 안의 상수는 클래스 상수만을 갖는다.
4. 인터페이스 안의 클래스 상수는 public, static, final을 모두 생략할 수 있다.
5. 인터페이스는 인스턴스를 생성할 수 없다.
6. 인터페이스는 다형성의 구현을 위해서 사용한다.

*/
	
	int RED = 1;
	int BLUE = 2;
	int GREEN = 3;
	int BLACK = 4;
	int LEOPARD = 5;
	
	void changeSkin(int skin);
}

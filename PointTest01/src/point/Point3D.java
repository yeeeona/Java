package point;
/*
 상속(Inheritance)
 - 부모 클래스의 자산을 물어 받아 자식 클래스에서 사용할 수 있도록 하는 것
 - 목적: 중복을 방지, 다형성 구현 -> 유지, 관리가 용이
 
 2. 상속을 하는 클래스 -> 부모, 기반(기본), 슈퍼, 상위
    상속을 받는 클래스 -> 자식, 파생, 	 	서브, 하
 
 */

/*
 < 클래스의 멤버에 대한 접근 제한(힌정) >
 접근 제한자(한정자, modifier) - public, protected, default, private
 1. public - 어디에서나 접근 가능
 2. protected - 상속을 받은 자식 클래스에서는 접근 가능, 같은 패키지는 물론이고, 패키지가 달라도 상속을 받았다면 접근 가
 3. default - 같은 패키지라면 접근 가능, 멤버 앞에 아무 것도 적지 않은 상태
 4. private - 같은 클래스에서만 사용 가능
 
 < 접근 제한자의 접근 범위 크기(세기) >
 public > protected > default > private
 <- 넓다, 약하다              좁다, 강하다 ->
 loose                             tight
 */

// 자식 클래스
// Point3D 클래스는 Point2D 클래스를 확장한다.
//Point3D 클래스는 Point2D로부터 모든 것을 상속받는다.
public class Point3D extends Point2D {
	private int z;
	
	// super(): 상속의 관계에서 자식의 생성자에서 부모의 생성자를 호출하는 것. 부모의 생성자에게 물려받은 변수의 초기화를 위임함.
	// this(): 자신의 생성자에서 다른 생성자를 호출하는 것

	public Point3D(int x, int y, int z) {
		super(x, y);
//		this.x = x;
//		this.y = y;
		this.z = z;
	}
	
	// getter
	public int getZ() {
		return z;
	}
	
	// setter
	public void setZ(int z) {
		this.z = z;
	}
	
	// Overriding(오버라이딩)
	// - 메소드의 재정의
	// - 상속의 관게에서 부모의 메소드를 자식의 클래스에서 재정의하는 것.
	// - 1. 부모의 메소드와 완벽하게 일치해야 한다. (리턴타입, 매개변수까지 동일)
	// - 2. 부모의 접근 제한자보다 약하거나 동등한 접근 제한자를 사용해야 한다.
	public String toStting() {
		//return "x = " + this.getX() + "y = " + this.getY() + "z = " + this.getZ();
		return super.toString() + "z = " + z;
	}
	
	// this. : 자신의 멤버(인스턴스)에 접근하는 방법
	// super. : 부모의 멤버에 접근하는 방법

}

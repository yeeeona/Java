package point;

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
	
	//
	public String toStting() {
		return "x = " + this.getX() + "y = " + this.getY() + "z = " + this.getZ();
	}

}

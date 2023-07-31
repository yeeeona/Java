package shape;

// Shape의 자식 클래스, HorizontalLine과 VerticalLine의 부모 클래스
public abstract class AbstractLine extends Shape {
	private int length;
	
	public AbstractLine(int length) {
		this.length = length;
	}
	
	public int getLength() {
		return length;
	}
	
	public void setLength(int length) {
		this.length = length;
	}

}

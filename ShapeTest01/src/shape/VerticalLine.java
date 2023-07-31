package shape;

// AbstractLine의 자식 클래스
public class VerticalLine extends AbstractLine{

	public VerticalLine(int length) {
		super(length);
	}
	
	@Override
	public void draw() {
		for(int i=1; i<getLength(); i++) {
			System.out.println("*");
		}
		System.out.println();
	}
	
	@Override
	public String toString() {
		return "VerticalLine (length: " + getLength() + ")";
	}
	
	
}

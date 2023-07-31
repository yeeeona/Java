package shape;

public abstract class Square implements Plane2D {
	private int width;
	private int height;
	
	
	public Square(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	@Override
	public int getArea() {
		return width * height;
	}
	
	
	public abstract void draw();
	
	public abstract String toString();
	
	public void print() {
		System.out.println(toString());
		draw();
	}
	

}

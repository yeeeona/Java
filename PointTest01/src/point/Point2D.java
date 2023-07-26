package point;

public class Point2D {
	// 1번 - 권장하지 않는 방법
	protected int x;
	protected int y;
   
	public  Point2D() {
      
    }
   
    public Point2D(int x, int y) {
       this.x = x;
       this.y = y;
    }
   
    //getter
    public int getX() {
       return x;
    }
   
    public int getY() {
       return y;
    }
   
    // setter
    public void setX(int x) {
       this.x = x;
    } 
   
    public void setY(int y) {
       this.y = y;
    }
   
    // 출력 메소드 - toString()
    public String toString() {
       return "x = " + x + ", y = " + y;
    }

}
package test;

import point.Point2D;
import point.Point3D;

// import point.*;

public class PointTest01 {
	public void main(String[] args) {
		Point2D p1 = new Point2D(10, 20);
		Point3D p2 = new Point3D(30, 40, 50);
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
	}
}

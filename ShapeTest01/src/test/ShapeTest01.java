package test;

import shape.*;

// 문제1) shape의 자식 클래스 4가지 도형을 배열에 담아서, 다형성을 구현하여 출력하시오.
public class ShapeTest01 {
	public static void main(String[] args) {
		// 배열 1번
		/*
		Shape[] shapes = new Shape[4];
		shapes[0] = new HorizontalLine(5);
		shapes[1] = new VerticalLine(3);
		shapes[2] = new VerticalLine(3);
		shapes[3] = new Point();
		*/
		// 배열 2번
		Shape[] shapes = new Shape [] {
				new HorizontalLine(5),
				new VerticalLine(3),
				new Rectangle(3, 5),
				new Point(),
		};
		
		// 출력 - 기본 for문
		/*
		for(int i=0; i<shapes.length; i++) {
			shapes[i].print();
			System.out.println();
		}
		*/
	
		// 출력 - 확장 for문
		for(Shape s : shapes) {
			s.print();
			System.out.println();
		}
		
	}
}

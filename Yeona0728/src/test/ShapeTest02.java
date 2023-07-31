package test;
import shape.*;

/*
 과제) ShapeTest01 프로젝트를 활용하여, 아래의 조건을 완성하시오.
 1. 도형의 면적을 계산하는 Plane2D 인터페이스를 만들고, 추상 메소드 getArea()를 추가하시오.
 2. 평행사변형 클래스인 Parallelogram을 추가하시오.
 3. Rectangle, Parallelogram의 부모 클래스 Square 클래스를 만들어 사용하시오.
 4. Rectangle, Parallelogram은 Plane2D 인터페이스를 구현하도록 하시오.
 
 5. 각 도형의 인스턴스를 담는 배열을 만들고 다형성을 구현하여 출력하시오.
 6. Rectangle. Parallelogram의 인스턴스는 면적을 출력하도록 하시오.
 */
public class ShapeTest02 {
	public static void main(String[] args) {
		// 인스턴스 배열 1번
		/*
		Square[] shapes = new Square[2];
		shape[0] = new Rectangle(4, 5);
		shape[1] = new Parallelogram(3,4);
		*/
		
		// 인스턴스 배열 2번
		Square[] shapes = new Square[] {
				new Rectangle(4, 5),
				new Parallelogram(3,4),
		};
		// 출력
		for(int i=0; i<shapes.length; i++) {
			shapes[i].print();
			if(shapes[i] instanceof Square) {
				System.out.println("Area: " + ((Square)shapes[i]).getArea());
			}
			System.out.println();
		}
	}
}

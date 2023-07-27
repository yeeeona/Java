package test;

import pet.*;

public class PetTest01 {
	public static void main(String[] args) {
		Pet happy = new Pet("해피", "손석구");
		RobotPet mark = new RobotPet("마크", "전미도");
		
		happy.introduce();
		System.out.println();
		mark.introduce();
		System.out.println();
		
		// 동적 바인딩(Dynamic Binding)
		// 부모의 자식을 참조해도 자식의 데이터(실제 데이터)를 출력한다.
		Pet star = mark; // 가능
		star.introduce();
	}

}

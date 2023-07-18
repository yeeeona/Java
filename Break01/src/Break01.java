
// break문은 반복문 하나 또는 switch~case문을 강제로 탈출.
// if문을 빠져나가는 것은 아님.

public class Break01 {
	public static void main(String[] args) {
		
		int i = 1;
		
		while(i <= 10) {
			if(i%5 == 0) {
				break;
			}
			
			System.out.println(i);
			i++;
		}
	}

}

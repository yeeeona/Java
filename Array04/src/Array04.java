
public class Array04 {
	public static void main(String[] args) {
		int scores[] = {85, 93, 71, 63, 82};
		int sum = 0;
		double ave = 0.0;
		
		
		for(int i=0; i<scores.length; i++) {
			System.out.printf("%d번 학생 점수: %d\n", i+1, scores[i]);
			sum += scores[i];
		}
		ave = (double)sum /scores.length;
		System.out.printf("총점 : %d\n평균 : %.2f", sum, ave);

	
	}
}

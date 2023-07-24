
public class Method09 {
	
	// 배열 매개변수
	static int getSum1(int[] a) {
		int sum =0;
		for(int i=0; i<a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
	
	// 가변 매개변수(파라미터): 같은 타입의 변수를 여러 개 받아서 배열로 처리함.
	static int getSum2(int...a) {
		int sum=0;
		for(int i=0; i<a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
	public static void main(String[] args){
		int[] a = {10, 20, 30, 40, 50};
		
		int sum1 = getSum1(a);
		int sum2 = getSum2(10, 20, 30);
		int sum3 = getSum2(10, 20, 30, 40, 50);
		int sum4 = getSum2(a);
		int sum5 = getSum2(new int[] {15, 25, 35, 45, 55}); // 일회용 배열
		
		System.out.println("sum1= " + sum1);
		System.out.println("sum2= " + sum2);
		System.out.println("sum3= " + sum3);
		System.out.println("sum4= " + sum4);
		System.out.println("sum5= " + sum5);
	}

}

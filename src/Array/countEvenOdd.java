package Array;

public class countEvenOdd {

	public static void main(String[] args) {
		int[] a= {34,56,1,4,2,355,88,0};
		int countEven=0;
		int countOdd=0;
		for(int num:a) {
			if(num%2==0) {
				countEven++;
			}else {
				countOdd++;
			}
		}
		System.out.println("Count Even: "+countEven);
		System.out.println("Count Odd: "+countOdd);

	}

}

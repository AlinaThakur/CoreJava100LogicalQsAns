package Array;

public class findSumAndAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {12,5,3,9,6};
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		double avg;
		avg=sum/a.length;
		System.out.println("Sum of numbers; "+sum);
		System.out.println("Avg of numbers; "+avg);

	}

}

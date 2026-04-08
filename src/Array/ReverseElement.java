package Array;

public class ReverseElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,3,4,5};
		System.out.println("Original Array");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
//		Reverse logic
		int start=0;
		int end=a.length-1;
		int temp;
		while(start<end) {
			temp=a[start];
			a[start]=a[end];
			a[end]=temp;
			start++;
			end--;
		}
		System.out.println("\nReverse ELement of an Array:");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+ " ");
		}
	}

}

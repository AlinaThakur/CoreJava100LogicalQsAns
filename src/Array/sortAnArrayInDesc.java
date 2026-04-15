package Array;

public class sortAnArrayInDesc {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5};
		System.out.println("Original Array");
		
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
		int temp=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[j]>a[i]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("\nAfter sorting in descending order");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}

}

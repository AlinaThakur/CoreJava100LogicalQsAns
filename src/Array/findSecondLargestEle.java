package Array;

public class findSecondLargestEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {6,1,2,4,13,10};
		int temp=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			if(i==1) {
				break;
			}
		}
		System.out.println("Second largest element: "+a[1]);
	}

}

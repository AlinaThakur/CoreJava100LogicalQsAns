package Array;

public class findLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {2,20,5,6,10};
		int maxEle=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]>maxEle) {
				maxEle=a[i];
			}
		}
		System.out.println("Largest Element: "+maxEle);
	}

}

package Array;

public class findSmallestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {34,7,56,1,89};
		int minEle=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]<minEle) {
				minEle=a[i];
			}
		}
		System.out.println("Smallest Element: "+minEle);
	}

}

package Array;

public class findDuplicateEle {

	public static void main(String[] args) {
		int[] a= {1,1,3,3,4,7};
		System.out.print("Duplicate Elements: ");
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.print(a[i]+" ");
				}
			}
		}
	}

}

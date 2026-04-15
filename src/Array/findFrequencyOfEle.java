package Array;

public class findFrequencyOfEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,2,3,1,4,2};
		int n=a.length;
		boolean[] visisted=new boolean[n];
		System.out.println("Element : frequency");
		for(int i=0;i<n;i++) {
			if(visisted[i]) {
				continue;
			}
			int count=1;
			for(int j=i+1;j<n;j++) {
				if(a[i]==a[j]) {
				count++;
				visisted[j]=true;
			}
			}
			System.out.println(a[i]+" : "+count);
		}
		
	}

}

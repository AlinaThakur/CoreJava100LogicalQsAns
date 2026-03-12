package String;

public class ReverseAStringWithoutUsingLibrary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] a= {'J','a','v','a'};
		System.out.println("Reverse String Without Using String library");
		for(int i=a.length-1;i>=0;i--) {
			System.out.print(a[i]);
		}
	}

}


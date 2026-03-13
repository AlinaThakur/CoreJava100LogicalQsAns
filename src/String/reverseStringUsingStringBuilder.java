package String;

public class reverseStringUsingStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Java";
		System.out.println("Original String s1: "+s1);
		String revStr=new StringBuilder(s1).reverse().toString();
		System.out.println("Reverse String of s1 : "+revStr);

	String s2="Hello Developer";
	StringBuilder sb=new StringBuilder(s2);
	String rev=sb.reverse().toString();
	System.out.println("Original String of s2: "+s2);
	System.out.println("Reverse String of s2: "+rev);
	}

}

package String;

public class reverseStringCountStringCheckPalindrom {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		String s="level";
		String revStr=new StringBuilder(s).reverse().toString();
		System.out.println("reverse string: "+revStr);
		System.out.println("Count of a String: "+s.length());
		
		if(s.equals(revStr)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
		
		
		String s2="mam";
		String revString="";
		for(int i=s2.length()-1;i>=0;i--) {
			revString+=s2.charAt(i);
		}
		System.out.println("Reverse String: "+revString);
		
		int count=s2.length();
		System.out.println("Count of a String: "+count);
		
		
		if(s2.equals(revString)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
	}

}

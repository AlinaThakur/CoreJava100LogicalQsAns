package String;

public class checkIsPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Mam";
		String revStr="";
		for(int i=s.length()-1;i>=0;i--) {
			revStr=revStr+s.charAt(i);
		}
		if(s.equalsIgnoreCase(revStr)) { //or use equals() 
			System.out.println(s+" is a Palindrome");
		}else {
			System.out.println(s+" is not a Palindrome");
		}
	}

}

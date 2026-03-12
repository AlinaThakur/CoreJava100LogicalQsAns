package String;

public class changeCaseOfEachChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Welcome Java";
		String result="";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(Character.isUpperCase(ch)) {
				result=result+Character.toLowerCase(ch);
			}else if(Character.isLowerCase(ch)) {
				result+=Character.toUpperCase(ch);
			}else {
				result=result+ch;
			}
		}
		System.out.println("Original String: "+s);
		System.out.println("Toggled String: "+result);

	}

}

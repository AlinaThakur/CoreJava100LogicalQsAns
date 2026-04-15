package String;

public class eachWordsFirstletterToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="convert first letter to upperCase";
		String[] sp=s.split(" ");
		String firstLeterCap="";
		for(int i=0;i<sp.length;i++) {
			char ch=sp[i].charAt(0);
			String subStr=sp[i].substring(1);
			firstLeterCap=firstLeterCap + Character.toUpperCase(ch) + subStr + " ";
		}
		System.out.println(firstLeterCap);
	}

}

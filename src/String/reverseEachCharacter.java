package String;

public class reverseEachCharacter {

	public static void main(String[] args) {
		String str="Hello Java";
		String[] sp=str.split(" ");
		String reverseStr="";
		for(String word:sp) {
			String reverseChar="";
			for(int i=word.length()-1;i>=0;i--) {
				reverseChar=reverseChar+word.charAt(i);
			}
			reverseStr=reverseStr+reverseChar + " ";
		}
		System.out.println(reverseStr);
	}

}

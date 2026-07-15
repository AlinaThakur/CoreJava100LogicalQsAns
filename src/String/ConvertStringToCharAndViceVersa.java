package String;

import java.util.Arrays;

public class ConvertStringToCharAndViceVersa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hello Java";
		char[] ch=s.toCharArray();
		System.out.println("convert String to Char Array: ");
		System.out.println(Arrays.toString(ch));
		
		String newStr=new String(ch);
		System.out.println("Convert char Array to String: "+newStr);
	}

}

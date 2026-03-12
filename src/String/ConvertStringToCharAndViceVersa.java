package String;

public class ConvertStringToCharAndViceVersa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hello Java";
		char[] ch=s.toCharArray();
		System.out.println("convert String to Char Array");
		for(char c:ch) {
			System.out.print(c+" ");
		}
		System.out.println();
		
		String newStr=new String(ch);
		System.out.println("Convert char Array to String: "+newStr);
	}

}

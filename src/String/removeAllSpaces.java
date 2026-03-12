package String;

public class removeAllSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="  Java Programming   langua  ge   ";
		System.out.println("Original String: "+s);
		String result=s.replaceAll(" ", "");
		System.out.println("Remove Spaces: "+result);
	}

}

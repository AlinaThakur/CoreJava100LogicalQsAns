package String;

public class acceptAStringAndPrintInitialLetter {

	public static void main(String[] args) {
		String s="Java Developer";
		String[] sp=s.split(" ");
		String initialLetter="";
		for(String word:sp) {
			initialLetter=initialLetter+word.charAt(0);
		}
		System.out.println(initialLetter);
	}

}

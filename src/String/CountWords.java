package String;

public class CountWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Java is a popular language";
		String[] countWords=s.trim().split("\\s+");
		System.out.println("Number of Words: "+countWords.length);
	}

}

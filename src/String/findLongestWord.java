package String;

public class findLongestWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Java Programe";
		String[] word=s.split(" ");
		String longWord="";
		for(String w:word) {
			if(w.length()>longWord.length()) {
				longWord=w;
			}
		}
		System.out.println("Longest Words: "+longWord);
	}

}

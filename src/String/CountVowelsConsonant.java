package String;

public class CountVowelsConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Programming Language";
		s.toLowerCase();
		int countVowels=0;
		int countConsonants=0;
		for(int i=0;i<s.length();i++) {
		char ch=s.charAt(i);
		if(ch>='a' && ch<='z') {
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				countVowels++;
			}else {
				countConsonants++;
			}
		}
		}
		System.out.println("Count vowels in a String: "+countVowels);
		System.out.println("Count consonants in a String: "+countConsonants);

	}

}

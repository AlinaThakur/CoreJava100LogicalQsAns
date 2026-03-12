package String;

import java.util.Arrays;

public class checkTwoStringsAreAnagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="vile";
		String s2="evil";
		
		s1.replaceAll(" ", "").toLowerCase();
		s2.replaceAll(" ", "").toLowerCase();
		
		if(s1.length()!=s2.length()) {
			System.out.println("Not Anagrams");
			return;
		}
		
		char[] a1=s1.toCharArray();
		char[] a2=s2.toCharArray();
		
		Arrays.sort(a1);
		Arrays.sort(a2);
		
		if(Arrays.equals(a1, a2)) {
			System.out.println("Anagrams");
		}else {
			System.out.println("Not Anagrams");
		}


	}

}

package String;

public class removeDuplicateWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Java Python AI Java AI";
		String[] spltStr=s.split(" ");
		String result="";
		for(int i=0;i<spltStr.length;i++) {
			if(!result.contains(spltStr[i]+" ")) {
				result=result+spltStr[i]+" ";
			}
		}
		System.out.println("Original Sentance: "+s);
		System.out.println("After removing duplicates: "+result);
	}

}

package String;

public class findFirstNonRepeatedChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="racecar";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			boolean isRepeated=false;
			for(int j=0;j<s.length();j++){
				if(i!=j && ch==s.charAt(j)) {
					isRepeated=true;
					break;
				}
			}
			if(!isRepeated) {
				System.out.println("First non repeated char: "+ch);
				return;
			}
			
		}
		System.out.println("Not non-repeated char found");

	}

}

package String;

public class findDuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Programming";
		char[] ch=s.toCharArray();
		System.out.println("Duplicate characters:");
		for(int i=0;i<ch.length;i++) {
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					System.out.println(ch[j]);
					break;
				}
			}
		}
	}

}

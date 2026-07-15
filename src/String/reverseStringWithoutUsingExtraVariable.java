package String;

public class reverseStringWithoutUsingExtraVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Java";
		System.out.println("Using only String");
		for(int i=s.length()-1;i>=0;i--) {
			System.out.print(s.charAt(i));
		}
		
		
//		Using String builder
		String s1="AI Devloper";
		System.out.println("\nUsing String Builder");
		System.out.println(new StringBuilder(s1).reverse());
	}

}

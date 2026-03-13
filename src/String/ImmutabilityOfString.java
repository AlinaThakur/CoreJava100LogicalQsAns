package String;

public class ImmutabilityOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Java";
		System.out.println("Original s1: "+s1);
		System.out.println("Try to Change the String");
		String s2=s1.concat(" Program");
		System.out.println("Afer Concat(Java does not modify s1),String objects cannot be chnaged they are immutable.");
		System.out.println("s1 Remaince unchanged: "+s1);
		System.out.println("s2 New String Created: "+s2);
	}

}

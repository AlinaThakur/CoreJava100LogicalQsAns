package String;

public class mutabilityOfStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb=new StringBuilder("Java");
		System.out.println("Original StringBuilder: "+sb);
		System.out.println("Modify the same object");
		sb.append(" Program");
		System.out.println("After append:"+sb);
		System.out.println("Modify again(String builder is mutable,meaning it can be changed.)");
		sb.insert(0, "Welcome to ");
		System.out.println("After insert: "+sb);
	}

}

package String;

public class appendStringUsingStringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer("Hello");
		sb.append(" ");
		sb.append("Developers");
		sb.append("!");
		sb.append(" ");
		sb.append("Welcome to Java");
		System.out.println("Demonstrate use of StringBuffer for appending strings: "+sb);
	}

}

package String;

public class OneStringIsRotationOfAnother {

	public static void main(String[] args) {

		String s1 = "abcd";
		String s2 = "dabc";

		// Check if lengths are equal
		if (s1.length() != s2.length()) {
			System.out.println("Not a rotational string");
			return;
		}

		// Combine s1 with itself
		String combined = s1 + s1;

		// Check if s2 exists inside combined
		if (combined.contains(s2)) {
			System.out.println("Rotation");
		} else {
			System.out.println("Not a rotation");
		}
	}
}
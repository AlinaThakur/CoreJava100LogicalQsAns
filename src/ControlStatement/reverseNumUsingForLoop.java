package ControlStatement;

public class reverseNumUsingForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int reverse=0;
		// Update num by removing its last digit instead of incrementing/decrementing.
		for(int num=12345;num>0;num=num/10) {
//			int rem=num%10;
			reverse=reverse*10+(num%10);
		}
		System.out.println("Reverse Number Using for loop: "+reverse);
	}

}

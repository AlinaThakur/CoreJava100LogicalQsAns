package ControlStatement;

public class checkPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=121;
		int rem=0;
		int rev=0;
		int temp=num;
		while(num>0) {
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		if(temp==rev) {
			System.out.println(temp+" is a Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
	}

}

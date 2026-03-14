package ControlStatement;

public class reverseANumUsingWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1234;
		int remainder;
		int reverseNum=0;
		while(num!=0) {
			remainder=num%10;
			reverseNum=reverseNum*10+remainder;
			num=num/10;
		}
		System.out.println("Reverse a Number: "+reverseNum);
	}

}

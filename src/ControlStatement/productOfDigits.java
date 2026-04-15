package ControlStatement;

public class productOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=897;
		int product=1;
		while(num>0) {
			product=product*(num%10);
			num=num/10;
		}
		System.out.println(product);
	}

}

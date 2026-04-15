package ControlStatement;

public class findCountOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=989584;
		int count=0;
		while(num>0) {
			num=num/10;
			count++;
		}
		System.out.println("Count no of Digits: "+count);
	}

}

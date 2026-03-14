package ControlStatement;

public class CheckPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=7;
		boolean isPrime=true;
		if(num<=1) {
			isPrime=false;
		}else {
			for(int i=2;i<=Math.sqrt(num);i++) {
				if(num%i==0) {
					isPrime=false;
					break;
				}
			}
		}
		if(isPrime) {
			System.out.println("The num is prime");
		}else {
			System.out.println("the no is not prime");
		}
	}

}

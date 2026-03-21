package ControlStatement;

public class checkArmstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=153;
		int sum=0;
		int rem;
		int temp=num;
		while(num>0) {
			rem=num%10;
			sum=sum+rem*rem*rem;
			num=num/10;
		}
		if(temp==sum) {
			System.out.println(temp+" is an Armstrong");
		}else {
			System.out.println(temp+" is not an Armstrong");

		}
		
	}

}

package ControlStatement;

public class countOddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int num=327598;
			int countEven=0;
			int countOdd=0;
			int rem=0;
			while(num>0) {
				rem=num%10;
			if(rem%2==0) {
				countEven++;
			}else {
				countOdd++;
			}
			num=num/10;
			}
			System.out.println("Count of Even num: "+countEven);
			System.out.println("Count of Odd num: "+countOdd);

	}

}

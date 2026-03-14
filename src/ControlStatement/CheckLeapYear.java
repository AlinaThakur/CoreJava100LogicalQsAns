package ControlStatement;

public class CheckLeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year=2024;
		if(year%400==0||(year%4==0 && year%100!=0)) {
			System.out.println("Is a leap year");
		}else {
			System.out.println("Is not a leap year");
		}
	}

}

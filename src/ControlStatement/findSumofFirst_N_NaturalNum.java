package ControlStatement;

import java.util.Scanner;

public class findSumofFirst_N_NaturalNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter N natural num: ");
		int n=sc.nextInt();
		int i=1;
		int sum=0;
		while(i<=n) {
			sum=sum+i;
			i++;
		}
		System.out.println("Sum of First N natural num:"+sum);
	}

}

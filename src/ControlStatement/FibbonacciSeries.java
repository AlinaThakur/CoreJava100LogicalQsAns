package ControlStatement;

import java.util.Scanner;

public class FibbonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of terms: ");
		int fNum=0;
		int sNum=1;
		int nextNum=0;
	int n=	sc.nextInt();
	System.out.println("Fibonacci up to "+n+" terms");
	for(int i=1;i<=n;i++) {
		System.out.println(fNum +" ");
		nextNum=fNum+sNum;
		fNum=sNum;
		sNum=nextNum;
	}
	}

}

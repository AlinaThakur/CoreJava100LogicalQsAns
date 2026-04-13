package Array;

import java.util.Arrays;

public class sortAnArrayInAsc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {45,1,23,78,67};
		
//		Using Arrays sort method to sort an array
		/*
		 * Arrays.sort(a); System.out.println("Sorted Array: "+Arrays.toString(a));
		 */
		
		System.out.println("Before Sorting");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
		int temp=0;
		for(int i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++) {
			if(a[j]<a[i]) { //Ascending order
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			}
		}
		}
		System.out.println("\nAfter Sorting");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}

}

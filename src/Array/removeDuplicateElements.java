package Array;

import java.util.HashSet;

public class removeDuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {3,3,55,66,55,77,66,89};
		HashSet<Integer> removeDuplicateEle=new HashSet<Integer>();
		for(int i=0;i<a.length;i++) {
		removeDuplicateEle.add(a[i]);
		}
		System.out.print("Remove Duplicate Elements: "+removeDuplicateEle);
	}}

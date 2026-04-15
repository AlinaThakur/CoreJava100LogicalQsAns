package Array;

import java.util.TreeSet;

public class removeDuplicateAndSortArray {

	public static void main(String[] args) {
		int[] a= {55,39,26,78,55,99,30,2};
		TreeSet<Integer> t=new TreeSet<>();
		for(int i=0;i<a.length;i++) {
			t.add(a[i]);
		}
		System.out.println("Remove the duplicate And Sort Elements: "+t);
	}

}

package Collection;

import java.util.Comparator;

// Comparator class to sort Student objects by name
public class sortByStuName implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getName().compareTo(o2.getName());
	}

	
	/*
	  @Override public int compare(Student o1, Student o2) { // Compare names of two students (case-insensitive)
	  return o1.getName().compareToIgnoreCase(o2.getName()); }
	 */
	
}




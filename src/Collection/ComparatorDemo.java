package Collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparatorDemo {

    public static void main(String[] args) {

        // Creating a list of Student objects
        List<Student> l = Arrays.asList(
                new Student(34, "Mounika"),
                new Student(4, "kiran"),
                new Student(89, "sunil")
        );

		/*
		  // Sorting list using Comparator (by name) 
		 Collections.sort(l, new sortByStuName());
		 
		 // Printing sorted list
		  System.out.println(l);
		 */   
        
        
        // Sorting list using Comparator (by id)
        Collections.sort(l, new sortByStuId());

        // Printing sorted list
        System.out.println(l);

        
    
    
    }
}
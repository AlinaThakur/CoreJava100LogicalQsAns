package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ComparableDemo {

    public static void main(String[] args) {
        // Create an ArrayList of Employee objects
        // Arrays.asList(...) converts multiple Employee objects into a fixed-size List
        // Then we pass it to new ArrayList<>(...) to make it resizable
        ArrayList<Employee> al = new ArrayList<>(Arrays.asList(
            new Employee(11, "Pooja", "p@gmail.com"),
            new Employee(8, "Anjali", "a@gmail.com"),
            new Employee(98, "Kiran", "k@gmail.com")
        ));

        // Sort the ArrayList
        // Collections.sort() uses the compareTo() method defined in Employee class
        // Here, compareTo() is currently sorting by name (alphabetically)
        Collections.sort(al);

        // Print the sorted ArrayList
        // System.out.println(al) internally calls toString() of each Employee
        // Without toString(), it would print object references like Employee@1a2b3c
        System.out.println(al);
    }
}
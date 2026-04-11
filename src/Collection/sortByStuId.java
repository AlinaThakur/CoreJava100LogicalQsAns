package Collection;

import java.util.Comparator;

//Comparator class to sort Student objects by id
public class sortByStuId implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
        //compare student ids (int values)
	    return Integer.compare(o1.getId(), o2.getId());
	    
	    
        // ✔ Alternative (less safe):
        // return o1.getId() - o2.getId();

	}
}

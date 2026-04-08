package Collection;

// Employee class implementing Comparable for sorting
public class Employee implements Comparable<Employee> {

    // Private variables (encapsulation)
    private int id;
    private String name;
    private String email;

    // Parameterized constructor
    // Used to create object with values
    public Employee(int id, String name, String email) {
        this.id = id;       // initialize id
        this.name = name;   // initialize name
        this.email = email; // initialize email
    }

    // Getter for id
    // Used when you need to access id outside the class
    public int getId() {
        return id;
    }

    // Setter for id
    // Used when you want to modify id later
    public void setId(int id) {
        this.id = id;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for email
    public String getEmail() {
        return email;
    }

    // Setter for email
    public void setEmail(String email) {
        this.email = email;
    }

    // compareTo() method is used for sorting
    // This defines the default sorting logic
    @Override
    public int compareTo(Employee o) {

        // Sorting by name (alphabetical order)
        // compareTo() returns:
        // negative → this < o
        // zero     → equal
        // positive → this > o
        return this.name.compareTo(o.name);

        // If you want to sort by id instead:
        // return Integer.compare(this.id, o.id);
    }

    // toString() is used to print object details
    // Without this, output will be like: Employee@1a2b3c
    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", email=" + email + "]";
    }
}
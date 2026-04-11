package Collection;

public class Student {

    // Instance variables (properties of Student)
    private int id;
    private String name;

    // Default constructor (used when no values are passed)
    public Student() {}

    // Parameterized constructor (used to initialize object with values)
    public Student(int id, String name) {
        this.id = id;     // assign id
        this.name = name; // assign name
    }

    // Getter method to get id value
    public int getId() {
        return id;
    }

    // Setter method to set id value
    public void setId(int id) {
        this.id = id;
    }

    // Getter method to get name value
    public String getName() {
        return name;
    }

    // Setter method to set name value
    public void setName(String name) {
        this.name = name;
    }

    // toString method → used to print object in readable format
    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + "]";
    }
}
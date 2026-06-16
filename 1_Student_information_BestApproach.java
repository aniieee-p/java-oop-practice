// Best Approach: Using Constructor, Encapsulation, and toString() method
class Student {
    // Private fields: restrict direct access (Encapsulation principle)
    private String name;
    private int rollNo;

    // Constructor: initializes the Student object with parameters
    // This ensures the object is created in a valid state
    public Student(String name, int rollNo) {
        this.name = name;      // Assign parameter value to instance variable 'name'
        this.rollNo = rollNo;  // Assign parameter value to instance variable 'rollNo'
    }

    // Getter method for 'name': allows controlled read access to the private field
    public String getName() {
        return name;
    }

    // Setter method for 'name': allows controlled write access to the private field
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for 'rollNo': allows controlled read access to the private field
    public int getRollNo() {
        return rollNo;
    }

    // Setter method for 'rollNo': allows controlled write access to the private field
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    // Override toString() method: returns a string representation of the object
    // This method is automatically called when printing the object
    @Override
    public String toString() {
        return "Student Name: " + name + "\nRoll Number: " + rollNo;
    }
}

// Public class that contains the main method
public class Main {
    // Main method: starting point of Java program
    public static void main(String[] args) {
        // Create a Student object using the constructor with parameters
        // This is better than creating empty object and assigning values later
        Student s = new Student("Ruchi", 101);

        // Print the object directly using toString() method
        // No need to call a separate display() method
        System.out.println(s);

        // You can also use getters to access individual fields
        System.out.println("\nAccessing via getters:");
        System.out.println("Name: " + s.getName());
        System.out.println("Roll No: " + s.getRollNo());

        // You can also use setters to modify the values
        s.setName("Aman");
        s.setRollNo(102);
        System.out.println("\nAfter modification:");
        System.out.println(s);
    }
}

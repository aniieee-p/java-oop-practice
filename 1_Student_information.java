// Define a class to represent a Student
class Student {
    // Field: stores the name of the student (String type)
    String name;
    // Field: stores the roll number of the student (int type)
    int rollNo;

    // Method: displays student information
    void display() {
        // Print the student name using concatenation
        System.out.println("Student Name: " + name);
        // Print the roll number using concatenation
        System.out.println("Roll Number: " + rollNo);
    }
}

// Public class that contains the main method (entry point of the program)
public class Main {
    // Main method: starting point of Java program (executed first)
    public static void main(String[] args) {
        // Create an object of Student class and assign it to variable 's'
        Student s = new Student();

        // Assign the value "Ruchi" to the 'name' field of object 's'
        s.name = "Ruchi";
        // Assign the value 101 to the 'rollNo' field of object 's'
        s.rollNo = 101;

        // Call the display() method of object 's' to print student information
        s.display();
    }
}
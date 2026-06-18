// Ques: Student Class (Static + Instance Members)
//1. Create a class named Student.

//2. Use the following members:

// Instance Variables

// * name
// * rollNo

// Static Variable

// * collegeName (same for all students)

// Instance Method

// * displayStudent() → displays student details.

// Static Method

// * changeCollege(String newCollege) → changes the college name for all students.
//3. Create at least 3 Student objects.
//4. Display the details of all students.
//5. Change the college name using the static method.
//6. Display the details again to verify that the college name has changed for all students


class Student{
    String name;
    int rollNo;
    static String collegeName;

    public Student(String name, int rollNo, String collegeName) {
    this.name = name;
    this.rollNo = rollNo;
    Student.collegeName = collegeName;
}

void displayStudent() {
    System.out.println("Name:" + name);
    System.out.println("RollNo:" + rollNo);
    System.out.println("CollegeName:" + collegeName);
    

}
static void changeCollege(String newCollege) {
    collegeName = newCollege;
}
}
public class StudentClass1 {
    public static void main(String args[]) {
        Student S1 = new Student("Anisha",1,"xyz");
        Student S2 = new Student("Aniee",2,"xyz");
        Student S3 = new Student("Ani",3,"xyz");
        S1.displayStudent();
        S2.displayStudent();
        S3.displayStudent();
        Student.changeCollege("abc");
        S1.displayStudent();
        S2.displayStudent();
        S3.displayStudent();

    }

}

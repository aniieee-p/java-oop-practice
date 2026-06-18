// 2. Employee Class (Constructors)

// Requirements:

// 1. Create a class Employee.

// 2. Include instance variables:
// o id
// o name
// o salary

// 3. Implement the following constructors:
// o No-Argument Constructor
// o Parameterized Constructor
// o Copy Constructor

// 4. Use this() constructor chaining in at least one constructor.

// 5. Create a method display() to print employee details.

// 6. Create objects using all constructors and display their information.

class Employee {
    int id;
    String name;
    double salary;

    // NO ARGUMENT CONSTRUCTOR
    Employee() {
        this(0, "Unknown", 0.0);
    }                    

    // PARAMETERIZED CONSTRUCTOR
    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // COPY CONSTRUCTOR
    Employee(Employee e) {
        this(e.id, e.name, e.salary);
    }

    // DISPLAY METHOD
    void display() {
        System.out.println("ID:" + id);
        System.out.println("Name:" + name);
        System.out.println("Salary:" + salary);
    }

}     

public class EmployeeClass {
    public static void main ( String args[]) {
        // no argument
        Employee emp1 = new Employee(); 
        // parameterized            
        Employee emp2 = new Employee(1, "Pratham", 100000);   
        // copy constructor
        Employee emp3 = new Employee(emp2);    
        emp1.display();
        emp2.display();
        emp3.display();     
    }
}




// Question: Multilevel Inheritance: Employee Salary Slip 
// Problem Description: 
// Create three classes Person → Employee → Salary. 
// * Person has name and age. 
// * Employee has empId and designation. 
// * Salary has basic, hra, da, and method to calculate gross salary. 
// Input Format: 
// * Name, age, empId, designation, basic, hra, da 
// Output Format: 
// * Employee details and gross salary 
// Constraints: 
// * Salary values must be non-negative 
// Method Signatures: 
// class Person { ... } 
// class Employee extends Person { ... } 
// class Salary extends Employee { 
// void calculateGross() 
// }

// paraent class
class Person {
    String Name;
    int age;

    // construtor
 Person (String name, int age) {
        this.Name = name;
        this.age = age;
    }

}



// child class
class Employee extends Person {
    String empId;
    String designation;
    


    // constructor
    Employee (String name, int age, String empId, String designation) {
        super(name, age);  // calling parent constructor
        // super.Person(); // calling parent constructor without parameters
        // super keyword is used to call the parent class constructor, and it must be the first statement in the child class constructor
        //  super of is used to call the parent class constructor, and it must be the first statement in the child class constructor
        // this keyword is used to refer to the current object instance, and it is often used to differentiate between instance variables and parameters with the same name. In this case, it is used to assign the values of empId and designation to the instance variables of the Employee class.
        // thi of is use to refer to the current object instance, and it is often used to differentiate between instance variables and parameters with the same name. In this case, it is used to assign the values of empId and designation to the instance variables of the Employee class.
        this.empId = empId;
        this.designation = designation;
    }
}

class Salary extends Employee {
    double basic;
    double hra;
    double da;
    

    Salary (double basic, double hra, double da, String name, int age, String empId, String designation) {
        super (name, age, empId, designation);

        if (basic < 0 || hra < 0 || da < 0) {
        System.out.println("Salary values must be non negative");
        }
     else {       
        this.basic = basic;
        this.hra = hra;
        this.da = da;
    }
}

void display() 
{
    double grossSalary = basic + hra + da;
    System.out.println("Name: " + Name);
    System.out.println("Age: " + age);
    System.out.println("EmpId: " + empId);
    System.out.println("Designation: " + designation);
    System.out.println("Gross Salary: " + grossSalary);
    System.out.println("Basic: " + basic);
    System.out.println("HRA: " + hra);
    System.out.println("DA: " + da);
}

}

class Main {
    public static void main(String[] args) {
        Salary s1 = new Salary(50000, 10000, 5000, "AP.J.", 30, "E123", "Software Engineer");
        s1.display();
    }
}

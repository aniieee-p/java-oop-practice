// // example of inheritence in java
// class Student {
//     String name;
//     int rollNo;

//     Student(String name, int rollNo) {
//         this.name = name;
//         this.rollNo = rollNo;
//     }

//     void displayInfo() {
//         System.out.println("Name: " + name);
//         System.out.println("rollNo: " + rollNo);
//     }
// }
//         this.age = age;
    

//     void displayInfo() {
//         System.out.println("Name: " + name);
//         System.out.println("rollNo: " + rollNo);

//     }


////////////////
// example of inheritence in java
class Student {
    String name;
    int rollNo;

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }
    
    void displayDetails() {
        System.out.println("Name:" + name);
        System.out.println("RollNo:"+ rollNo);
    }
}
    
class Marks extends Student {
    int m1, m2, m3;
    
    Marks(String name, int rollNo) {
        super(name, rollNo);
    }
    
    void inputMarks(int m1, int m2, int m3) { 
        if (m1>=0 && m1<=100 &&
        m2>=0 && m2<=100 &&
        m3>=0 && m3<=100)
        {
             this.m1=m1;
             this.m2=m2;
             this.m3=m3;
        } else 
        {
            System.out.println("marks must be btw 0 to 100");
        }
    }
    
    void displayResult(){
        displayDetails();
        int sum = m1+m2+m3;
        System.out.println("Marks:" + m1+ " " + m2 + " " + m3);
        System.out.println("Total:" + sum);
    }
}

class Main{
    public static void main(String[] args) {
        Marks m = new Marks("Ani", 1);
        m.inputMarks(5,6,7);
        m.displayResult();
    }
}





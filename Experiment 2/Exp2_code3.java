public class Exp2_code3 {

    String name;
    int rollNumber;
    String department;
    double marks;

    // Default Constructor
    Exp2_code3() {
        name = "Unknown";
        rollNumber = 0;
        department = "None";
        marks = 0.0;
    }

    // Parameterized Constructor (2 Parameters)
    Exp2_code3(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
        department = "Computer";
        marks = 0.0;
    }

    // Copy Constructor
    Exp2_code3(Exp2_code3 s) {
        this.name = s.name;
        this.rollNumber = s.rollNumber;
        this.department = s.department;
        this.marks = s.marks;
    }

    void display() {
        System.out.println("Name       : " + name);
        System.out.println("Roll No    : " + rollNumber);
        System.out.println("Department : " + department);
        System.out.println("Marks      : " + marks);
        System.out.println();
    }

    public static void main(String[] args) {

        Exp2_code3 s1 = new Exp2_code3();

        Exp2_code3 s2 = new Exp2_code3("Rahul", 101);
        s2.department = "Computer";
        s2.marks = 90.5;

        Exp2_code3 s3 = new Exp2_code3(s2);

        System.out.println("Default Constructor");
        s1.display();

        System.out.println("Parameterized Constructor");
        s2.display();

        System.out.println("Copy Constructor");
        s3.display();
    }
}
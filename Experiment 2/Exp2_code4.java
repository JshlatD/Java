public class Exp2_code4 {

    // Circle Constructor
    Exp2_code4(double radius) {
        double area = 3.14 * radius * radius;
        System.out.println("Area of Circle = " + area);
    }

    // Square Constructor
    Exp2_code4(int side) {
        int area = side * side;
        System.out.println("Area of Square = " + area);
    }

    // Rectangle Constructor
    Exp2_code4(int length, int breadth) {
        int area = length * breadth;
        System.out.println("Area of Rectangle = " + area);
    }

    public static void main(String[] args) {

        new Exp2_code4(7.0);     // Circle

        new Exp2_code4(5);       // Square

        new Exp2_code4(10, 6);   // Rectangle
    }
}
public class Exp2_code1 {

    int length, breadth, height;

    // Default Constructor
    Exp2_code1() {
        length = 2;
        breadth = 2;
        height = 2;
    }

    // Constructor with one parameter
    Exp2_code1(int side) {
        length = side;
        breadth = side;
        height = side;
    }

    // Constructor with three parameters
    Exp2_code1(int l, int b, int h) {
        length = l;
        breadth = b;
        height = h;
    }

    void displayVolume() {
        int volume = length * breadth * height;

        System.out.println("Length = " + length);
        System.out.println("Breadth = " + breadth);
        System.out.println("Height = " + height);
        System.out.println("Volume = " + volume);
        System.out.println();
    }

    public static void main(String[] args) {

        Exp2_code1 c1 = new Exp2_code1();
        Exp2_code1 c2 = new Exp2_code1(5);
        Exp2_code1 c3 = new Exp2_code1(4, 5, 6);

        c1.displayVolume();
        c2.displayVolume();
        c3.displayVolume();
    }
}
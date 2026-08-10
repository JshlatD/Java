// Program to Convert a String into an Integer Wrapper Object
import java.util.Scanner;

public class code1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an Integer: ");
        String str = sc.nextLine();

        Integer num = Integer.valueOf(str);

        System.out.println("Original String : " + str);
        System.out.println("Wrapper Object  : " + num);
        System.out.println("Primitive Value : " + num.intValue());

        sc.close();
    }
}
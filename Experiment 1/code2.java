import java.util.Scanner;

public class code2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = scan.nextInt();

        System.out.print("Enter second number: ");
        int b = scan.nextInt();

        System.out.print("Enter third number: ");
        int c = scan.nextInt();

        if (a > b && a > c)
            System.out.println("A is the greatest");
        else if (b > c)
            System.out.println("B is the greatest");
        else
            System.out.println("C is the greatest");

        scan.close();
    }
}
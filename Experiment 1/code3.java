import java.util.Scanner;

public class code3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = scan.nextInt();

        System.out.print("Enter second number: ");
        int b = scan.nextInt();

        System.out.println("\n1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.print("Enter your choice: ");
        int choice = scan.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Result = " + (a + b));
                break;

            case 2:
                System.out.println("Result = " + (a - b));
                break;

            case 3:
                System.out.println("Result = " + (a * b));
                break;

            case 4:
                System.out.println("Result = " + (a / b));
                break;

            default:
                System.out.println("Invalid Choice");
        }

        scan.close();
    }
}
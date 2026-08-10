// Program for calculator
import java.util.Scanner;

public class code5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        String s1 = sc.nextLine();

        System.out.print("Enter Second Number: ");
        String s2 = sc.nextLine();

        Integer n1 = Integer.valueOf(s1);
        Integer n2 = Integer.valueOf(s2);

        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.print("Enter Choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Result = " + (n1 + n2));
                break;
            case 2:
                System.out.println("Result = " + (n1 - n2));
                break;
            case 3:
                System.out.println("Result = " + (n1 * n2));
                break;
            case 4:
                System.out.println("Result = " + (n1 / n2));
                break;
            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}
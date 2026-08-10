import java.util.Scanner;

public class code1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = scan.nextInt();

        System.out.print("Enter second number: ");
        int b = scan.nextInt();

        int sum = a + b;

        System.out.println("Sum = " + sum);

        scan.close();
    }
}
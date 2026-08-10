import java.util.Scanner;

public class code6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter starting number: ");
        int start = scan.nextInt();

        System.out.print("Enter ending number: ");
        int end = scan.nextInt();

        int sum = 0;

        for (int i = start; i <= end; i++) {
            sum = sum + i;
        }

        System.out.println("Sum = " + sum);

        scan.close();
    }
}
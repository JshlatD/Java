// Program to Convert Two String Numbers into Integer Objects and Find Their Sum
import java.util.Scanner;

public class code2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        String s1 = sc.nextLine();

        System.out.print("Enter Second Number: ");
        String s2 = sc.nextLine();

        Integer n1 = Integer.valueOf(s1);
        Integer n2 = Integer.valueOf(s2);

        int sum = n1 + n2;

        System.out.println("Sum = " + sum);

        sc.close();
    }
}
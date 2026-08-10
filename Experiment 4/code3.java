// Program to Check Whether a Number is Even or Odd Using Wrapper Class
import java.util.Scanner;

public class code3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        String str = sc.nextLine();

        Integer num = Integer.valueOf(str);

        if (num % 2 == 0)
            System.out.println("Even Number");
        else
            System.out.println("Odd Number");

        sc.close();
    }
}
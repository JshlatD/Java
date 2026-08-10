import java.util.Scanner;

public class code1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String password = "62621008";

        System.out.print("Enter Password: ");
        String input = sc.nextLine();

        if (password.equals(input)) {
            System.out.println("Password is Correct");
        } else {
            System.out.println("Password is Incorrect");
        }

        sc.close();
    }
}
import java.util.Scanner;

public class code7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        System.out.print("Enter Index: ");
        int index = sc.nextInt();

        System.out.print("Enter New Character: ");
        char ch = sc.next().charAt(0);

        String result = str.substring(0, index) + ch + str.substring(index + 1);

        System.out.println("Updated String = " + result);

        sc.close();
    }
}
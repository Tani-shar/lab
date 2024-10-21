import java.util.Arrays;
import java.util.Scanner;

public class MenuDrivenStringOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = sc.nextLine();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Check Palindrome");
            System.out.println("2. Alphabetical Order");
            System.out.println("3. Reverse String");
            System.out.println("4. Concatenate Original and Reversed String");
            System.out.println("5. Exit");
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    String reversed = new StringBuilder(input).reverse().toString();
                    if (input.equals(reversed)) {
                        System.out.println("The string is a palindrome.");
                    } else {
                        System.out.println("The string is not a palindrome.");
                    }
                    break;
                case 2:
                    char[] chars = input.toCharArray();
                    Arrays.sort(chars);
                    System.out.println("String in alphabetical order: " + new String(chars));
                    break;
                case 3:
                    System.out.println("Reversed string: " + new StringBuilder(input).reverse().toString());
                    break;
                case 4:
                    String concat = input + new StringBuilder(input).reverse().toString();
                    System.out.println("Concatenated string: " + concat);
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}

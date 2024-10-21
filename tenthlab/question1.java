import java.util.Scanner;
// Question 1: Program that handles NumberFormatException
class NumberFormatExceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter a number: ");
            String input = sc.nextLine();
            int number = Integer.parseInt(input);
            System.out.println("The entered number is: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format: " + e.getMessage());
        }
    }
}

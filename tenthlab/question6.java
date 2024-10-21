import java.util.Scanner;
class NegativeRootCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        double number = sc.nextDouble();

        if (number < 0) {
            System.out.println("Invalid input: Cannot find the root of a negative number.");
        } else {
            System.out.println("Square root of the number: " + Math.sqrt(number));
        }
    }
}

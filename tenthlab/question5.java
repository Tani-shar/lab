import java.util.Scanner;
class ValidateSquareMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int cols = sc.nextInt();

        if (rows == cols) {
            System.out.println("It is a square matrix.");
        } else {
            System.out.println("It is not a square matrix.");
        }
    }
}


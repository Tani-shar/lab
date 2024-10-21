import java.util.*;
class ArrayOverflowExceptionHandling {
    public static void main(String[] args) {
        int[] arr = new int[5]; // array size 5
        Scanner sc = new Scanner(System.in);
        try {
            for (int i = 0; i <= 5; i++) { // purposely accessing an out-of-bound index
                System.out.println("Enter a number for index " + i + ": ");
                arr[i] = sc.nextInt();
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds: " + e.getMessage());
        }
    }
}

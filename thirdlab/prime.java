import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lower limit:");
        int a = sc.nextInt();
        System.out.println("Enter the upper limit:");
        int b = sc.nextInt();

        System.out.println("Prime numbers between " + a + " and " + b + " are:");

        for (int i = a; i < b; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
        sc.close();
    }

  
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        if (num % 2 == 0) {
            return false; 
        }
        for (int j = 3; j <= Math.sqrt(num); j += 2) {
            if (num % j == 0) {
                return false;
            }
        }
        return true;
    }
}

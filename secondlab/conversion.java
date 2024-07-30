/**
 * conversion
 */
import java.util.Scanner;
public class conversion {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter int ");
        int a = in.nextInt();
        System.out.println("Enter char ");
        char b = in.next().charAt(0);
        System.out.println("Enter double");
        double c = in.nextDouble();
        byte e = (byte) a;
        int f = (int) b;
        byte g = (byte) c;
        int h = (int) c;
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);

    }
}
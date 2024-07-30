import java.util.Scanner;
public class additional2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        int maximum = (n1 > n2) ? 
          (n1 > n3 ? n1 : n3) : 
          (n2 > n3 ? n2 : n3);
        System.out.println(maximum);
    }
}

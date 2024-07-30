import java.util.Scanner;
public class additional1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = (a<<2)+(b>>2);
        boolean d = (b>0) ;
        int e = (a+b*100)/10;
        int f = a & b; 
        System.out.println(c);
        System.out.println(d);  
        System.out.println(e);
        System.out.println(f);
        in.close();
    }
}

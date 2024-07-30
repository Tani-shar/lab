
public class outputcheck {
    public static void main(String[] args) {
        int a = 10;
        double e = a;
        System.out.println(e);
        // double b =10.5;
        // int f = b;
        // System.out.println(f);
        double c = 10.5;
        int g = (int) c;
        System.out.println(g);
    }
}
// note to myself
// when we use int to double no data loss will be done and a x.00 wil be added
// we cant convert double to int 
//but we can implicit cast it and we will lose integer data;
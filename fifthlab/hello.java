import java.util.Scanner;
class Box {
    double width;
    double height;
    double length;

    Box(double w, double h, double l){
        width = w;
        height = h;
        length = l;
    }
    double volume(){
        return width*height*length;
    }
}

public class hello{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dimensions");
        int w = sc.nextInt();
        int h = sc.nextInt();
        int l = sc.nextInt();

        Box box1 = new Box(w,h,l);
        double vol = box1.volume();
        System.out.println(vol);
        sc.close();
    }
}

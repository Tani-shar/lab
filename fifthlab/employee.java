import java.util.Scanner;

class emp {
    String name;
    String city;
    int sal;
    int da;
    int hra;

    void getData(){
        Scanner sc = new Scanner(System.in);
        String n;
        String c;
        int s;
        int d;
        int h;
        System.out.println("Enter the details");
        n=sc.nextLine();
        c=sc.nextLine();
        s=sc.nextInt();
        d=sc.nextInt();
        h=sc.nextInt();
        name = n;
        city = c ;
        sal = s;
        da = d;
        hra = h;

    }
    int calculate(){
        return sal +sal*da/100+sal*hra/100;
    }
    void display(){
        System.out.println(calculate());
    }
}
/**
 * employee
 */
public class employee {
    public static void main(String[] args) {
        emp raj = new emp();
        raj.getData();
        raj.calculate();
        raj.display();
    }

    
    
}


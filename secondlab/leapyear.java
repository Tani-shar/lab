/**
 * leapyear
 */
import java.util.Scanner;
public class leapyear {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a year");
        int a = in.nextInt();
        if(a%4==0 | a%100==0 | a%400==0){
            System.out.println("leap year");
                    }
        else{
            System.out.println("Common year");
                    }
        
    }
}
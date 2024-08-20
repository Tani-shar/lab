
import java.util.Scanner;

class Number{

    boolean isZero(int a){
        return a==0;
    }
    boolean isPositive(int a){
        return a>0;
    }
    boolean isNegative(int a){
        return a<0;
    }
    boolean isOdd(int a){
        return a%2!= 0;
    }
    boolean isEven(int a){
        return a%2==0;
    }
    boolean isPrime(int a ){
        int i;
        for(i=3;i<=Math.sqrt(a);i+=2){
            if(a%i==0){
                return false;
                
            }
        }
        return true;
    }
    boolean isArmstrong(int a){
        int number=0;
        int rem;
        int check =a;
        while(a>0){
            rem=a%10;
            number+=rem*rem*rem;
            a/=10;
        }
        return number==check;
    }
    

}
public class question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Number n = new Number();
        int a=sc.nextInt();
        n.isZero(a);
        n.isArmstrong(a);
        n.isEven(a);
        n.isOdd(a);
        n.isPrime(a);
    }
}

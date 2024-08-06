import java.util.Scanner;

class armstrong{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        int temp = a;
        int rem,ans = 0;
        while(a>0){
            rem = a%10;
            ans+=rem*rem*rem;
            a/=10;
        }
        if(ans==temp){
            System.out.println("armstrong");
        }
        else{
            System.err.println("not armstrong");
        }
    }
}
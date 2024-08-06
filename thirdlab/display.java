import java.util.Scanner;
public class display {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter the number ");
        int a = sc.nextInt();
        for(int i = 0 ; i<a+1;++i){
            for(int j = 0; j<i;++j){
                System.err.print(i);
            }
            System.err.print("\n");
        }

        

    }
}

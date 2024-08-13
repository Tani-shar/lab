
import java.util.Scanner;

public class displayprinicple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter row and column of array of array");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int arr[][] = new int[50][50];
        System.out.println("enter the element");
        for(int i = 0 ; i<m;i++){
            for(int j = 0 ; j <n ;j++ ){
                arr[i][j]=sc.nextInt();
            }
        }
        int sum = 0 ;
        for(int i = 0 ; i<m; i++){
            for(int j = 0; j<n;j++){
                if(i == j){
                    System.out.println(arr[i][j]);
                    sum+=arr[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}

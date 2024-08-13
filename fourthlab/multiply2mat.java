import java.util.Scanner;

public class multiply2mat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter row and column of array of array");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int arr[][] = new int[50][50];
        int arr2[][] = new int[50][50];
        int res[][] = new int[50][50];
        System.out.println("enter the element of first array");
        for(int i = 0 ; i<m;i++){
            for(int j = 0 ; j <n ;j++ ){
                arr[i][j]=sc.nextInt();
                
            }
        }
        System.out.println("Enter row and column of array of array");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(n!=a){
            System.out.println("cannot multiply");
            return;
        }
        System.out.println("Enter the element of second matrix");
        for(int i = 0 ; i<a;i++){
            for(int j = 0 ; j <b ;j++ ){
                arr2[i][j]=sc.nextInt();
                
            }
        }
        for(int i = 0 ; i<m;i++){
            for(int j = 0; j<b;j++){
                for(int k = 0 ; k<b;k++){
                    res[i][j]=arr[i][k]*arr2[k][j];
                }
            }
        }
        for(int i = 0 ; i <m ; i++){
            for(int j = 0 ; j< b ; j++){
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}

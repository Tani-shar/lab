import java.util.Scanner;

/**
 * symmetricmatrix
 */
public class symmetricmatrix {
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
        int flag = 1;
        for(int i = 0 ; i<m ; i++){
            for(int j = 0 ; j<n; j++){
                if(arr[i][j]!=arr[j][i]){
                    System.out.println("not symmetrix");
                    flag = 0;
                    break;
                }
                if(flag == 0){
                    break;
                }
            }
        }
        if (flag == 1) {
            System.out.println("Symmetric");
        }

    }
    
}
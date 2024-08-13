import java.util.Scanner;

public class magicsquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
    
        System.out.println("Enter the number of rows and columns of the matrix:");
        int m = sc.nextInt();
        int n = sc.nextInt();
        
        int[][] arr = new int[m][n];
        int diagonalSum1 = 0; 
        int diagonalSum2 = 0; 
        
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
                
                if (i == j) {
                    diagonalSum1 += arr[i][j];
                }
                
                if (i + j == m - 1) {
                    diagonalSum2 += arr[i][j];
                }
            }
        }
        
        if (m != n) {
            System.out.println("The matrix is not square.");
            return;
        }
        
        int targetSum = diagonalSum1;
        boolean isMagicSquare = true;
        
        for (int i = 0; i < m; i++) {
            int rowSum = 0;
            int colSum = 0;
            
            for (int j = 0; j < n; j++) {
                rowSum += arr[i][j];
                colSum += arr[j][i];
            }
            
            if (rowSum != targetSum || colSum != targetSum) {
                isMagicSquare = false;
                break;
            }
        }
        
        if (diagonalSum1 != targetSum || diagonalSum2 != targetSum) {
            isMagicSquare = false;
        }

        if (isMagicSquare) {
            System.out.println("The matrix is a magic square.");
        } else {
            System.out.println("The matrix is not a magic square.");
        }
    }
}

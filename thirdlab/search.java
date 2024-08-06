import java.util.Scanner;
class search{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int len = sc.nextInt();
        int [] arr = new int[len];
        
        
        System.out.println("enter the elements");
        for(int i = 0 ; i<len ; i++){
            int a = sc.nextInt();
            arr[i]=a;
        }
        System.out.println("Enter the element to be found");
        int target = sc.nextInt();
        int k = 0;
        for(int i : arr){
            if(i==target){
                System.out.println("Found at position" +k);
            }
            k++;
        }
    }
}
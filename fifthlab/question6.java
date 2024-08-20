import java.util.Scanner;

/**
 * Books
 */
class Books {
    String name;
    String Author;
    int EditionNumber;
    
    Books(String s , String a, int e){
        this.name = s;
        this.Author = a;
        this.EditionNumber=e;
    }
    
}
public class question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Books arr[]= new Books[10];
        for(int i = 0 ; i<6;i++){
            System.out.println("Enter name author and edition number");
            String name = sc.nextLine();
            String author = sc.nextLine();
            int editionnumber = sc.nextInt();
            sc.nextLine();
            arr[i]=new Books(name, author, editionnumber);

        }
        // Arrays.sort(arr, 0, 6);
        String name1=sc.nextLine();
        
        for(int i = 0 ; i<6;i++){
            if(arr[i].Author.compareTo(name1)==0){
                System.out.println(arr[i].name);
                System.out.println(arr[i].Author);
                System.out.println(arr[i].EditionNumber);
            }

        }
    }
    
}
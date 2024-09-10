class student{
    int regno;
    String name ; 
    int age ; 

    student(int regno , String name , int age ){
        this.regno = regno;
        this.name = name;
        this.age = age;
    }
    void displayStudentDetail(){
        System.out.println("registratoin no : " +regno);
        System.out.println("Name" +name);
        System.out.println("age"+age);
    }
}
class ug extends student{
    int fees;
    int semester;
    static int Ugcount = 0;
    public ug(int regno, String name , int age, int fees , int semester){
        super(regno, name , age);
        this.fees = fees;
        this.semester = semester;
        Ugcount++;
    }
    @Override
    void displayStudentDetail(){
        super.displayStudentDetail();
        System.out.println("Fees"+fees);
        System.out.println("semester"+semester);
    }
    static void displaycount(){
        System.out.println("number of ug admission: " + Ugcount);
    }

}
class pg extends student{
    int fees;
    int semester;
    static int Pgcount = 0;
    public pg(int regno, String name , int age, int fees , int semester){
        super(regno, name , age);
        this.fees = fees;
        this.semester = semester;
        Pgcount++;
    }
    @Override
    void displayStudentDetail(){
        super.displayStudentDetail();
        System.out.println("Fees"+fees);
        System.out.println("semester"+semester);
    }
    static void displaycount(){
        System.out.println("Number of pg student: " + Pgcount);
    }
}
public class question2 {
    public static void main(String[] args) {
       
        ug ug1 = new ug(1, "John Doe", 18, 1, 15000);
        ug ug2 = new ug(12, "Jane Smith", 19, 2, 15500);
 
        pg pg1 = new pg(2, "Alice Brown", 22, 1, 20000);
        pg pg2 = new pg(23, "Bob Green", 23, 3, 20500);

        System.out.println("UG Students:");
        ug1.displayStudentDetail();
        System.out.println();
        ug2.displayStudentDetail();
        System.out.println();

        System.out.println("PG Students:");
        pg1.displayStudentDetail();
        System.out.println();
        pg2.displayStudentDetail();
        System.out.println();

        ug.displaycount();
        pg.displaycount();
    }

}


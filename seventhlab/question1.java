class studentdetail{
    String name ; 
    int id ; 
    static String colname = "MIT";

    public studentdetail(String name , int id) {
        this.name = name ; 
        this.id = id;
    }
    void getdetail(){
        System.out.println("Student Name: " + name);
        System.out.println("Student ID: " + id);
        System.out.println("College Name: " + colname);

    }
    
}
class question1{
    public static void main(String[] args) {
        
        studentdetail student1 = new studentdetail("Alice", 1);
        studentdetail student2 = new studentdetail("Bob", 2);

      
        System.out.println("Details of Student 1:");
        student1.getdetail();
        
        System.out.println("\nDetails of Student 2:");
        student2.getdetail();
    }

}

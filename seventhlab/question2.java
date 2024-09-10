class counter{
    static int count = 0;
    
    counter(){
        count++;
    }
    static void displaycount(){
        System.out.println("number of count = " +count);
    }
}
public class question2 {
    public static void main(String[] args) {
        counter c = new counter();
        counter a = new counter();
        counter b = new counter();
        counter d = new counter();
        counter.displaycount();
        
    }
}

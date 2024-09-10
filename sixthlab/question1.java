package sixthlab;
class account{
    String customerName;
    int accno;
    String accountType;
    

    account(String customerName, int accno, String accountType){
        this.customerName = customerName ; 
        this.accno = accno;
        this.accountType = accountType;
        
    }
    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("Amount deposited"+amount);
        } else{
            System.out.println("invalid operation");
        }
    }
    public void displayBalance(){
        Sy
    }

}
class savings extends account{
    int balance;
    saving(String customerName, int accno, int balance){
        super(customerName, accno, "savings", balance);
    }
    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("Amount deposited"+amount);
        } else{
            System.out.println("invalid operation");
        }
    }
    
    
}
class current extends account{
    int currbalance;

}
public class question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    }
}

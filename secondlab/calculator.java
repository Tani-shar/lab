import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        float answer;
        char more='y';
        Scanner in = new Scanner(System.in);
        System.out.println("enter number 1");
        float a = in.nextFloat();
        System.out.println("Enter an operator");
        char o = in.next().charAt(0);
        System.out.println("enter number 2");
        float b = in.nextFloat();
        while(more!='n'){
            switch (o) {
                case '+':
                    answer=a+b;
                    System.out.println(answer);
                    break;
                case '-':
                    answer=a-b;
                    System.out.println(answer);
                    break;
                case '*':
                    answer = a*b;
                    System.out.println(answer);
                    break;
                case '/':
                    if(b!=0){
                        answer = a/b;
                        System.out.println(answer);
                        break;
                    }
                    else{
                        System.out.println("division by zero not allowed");
                        break;
                    }
            
            }
            System.out.println("do you want more");
            more = in.next().charAt(0);
            in.close();
        }
    }
}

import java.util.Scanner;
class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

class UserDefinedExceptionHandling {
    public static void main(String[] args) {
        try {
            throw new CustomException("This is a custom exception message");
        } catch (CustomException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}

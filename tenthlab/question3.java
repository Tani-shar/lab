import java.util.Scanner;
class StudentDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter student's name: ");
            String name = sc.nextLine();
            System.out.println("Enter roll number: ");
            int rollNumber = Integer.parseInt(sc.nextLine());
            System.out.println("Enter marks for 3 subjects: ");
            int marks1 = Integer.parseInt(sc.nextLine());
            int marks2 = Integer.parseInt(sc.nextLine());
            int marks3 = Integer.parseInt(sc.nextLine());

            int total = marks1 + marks2 + marks3;
            double percentage = (total / 3.0);

            System.out.println("Percentage: " + percentage);
            if (percentage >= 90) {
                System.out.println("Grade: A");
            } else if (percentage >= 80) {
                System.out.println("Grade: B");
            } else if (percentage >= 70) {
                System.out.println("Grade: C");
            } else {
                System.out.println("Grade: D");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format for marks or roll number: " + e.getMessage());
        }
    }
}

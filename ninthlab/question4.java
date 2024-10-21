import java.util.Scanner;

public class MenuDrivenStringComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String str1 = sc.nextLine();
        System.out.println("Enter the second string: ");
        String str2 = sc.nextLine();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Compare two strings");
            System.out.println("2. Convert case of the first string");
            System.out.println("3. Check if one string is a substring of the other");
            System.out.println("4. Replace substring with 'Hello'");
            System.out.println("5. Exit");
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    if (str1.equals(str2)) {
                        System.out.println("Strings are equal.");
                    } else {
                        System.out.println("Strings are not equal.");
                    }
                    break;
                case 2:
                    StringBuilder converted = new StringBuilder();
                    for (char c : str1.toCharArray()) {
                        if (Character.isUpperCase(c)) {
                            converted.append(Character.toLowerCase(c));
                        } else {
                            converted.append(Character.toUpperCase(c));
                        }
                    }
                    System.out.println("Converted string: " + converted.toString());
                    break;
                case 3:
                    if (str1.contains(str2)) {
                        System.out.println(str2 + " is a substring of " + str1);
                    } else if (str2.contains(str1)) {
                        System.out.println(str1 + " is a substring of " + str2);
                    } else {
                        System.out.println("No substring relation.");
                    }
                    break;
                case 4:
                    if (str1.contains(str2)) {
                        str1 = str1.replace(str2, "Hello");
                        System.out.println("Modified first string: " + str1);
                    } else if (str2.contains(str1)) {
                        str2 = str2.replace(str1, "Hello");
                        System.out.println("Modified second string: " + str2);
                    } else {
                        System.out.println("No substring found to replace.");
                    }
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}

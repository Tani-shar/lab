import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = sc.nextLine();

        int characters = input.length();
        int words = input.split("\\s+").length;
        int lines = input.split("[\\r\\n]+").length;
        int vowels = 0;

        for (char c : input.toLowerCase().toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowels++;
            }
        }

        System.out.println("Number of characters: " + characters);
        System.out.println("Number of words: " + words);
        System.out.println("Number of lines: " + lines);
        System.out.println("Number of vowels: " + vowels);
    }
}

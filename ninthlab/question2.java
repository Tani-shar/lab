import java.util.Scanner;

public class ReplaceRepeatingCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = sc.nextLine();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (word.indexOf(c) != word.lastIndexOf(c)) {
                result.append(c);
            } else {
                result.append('_');
            }
        }

        System.out.println("Result: " + result.toString());
    }
}

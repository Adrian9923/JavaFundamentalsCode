import java.util.Scanner;

public class RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] words = line.split(" ");
        for (String word : words) {
            int size = word.length();
            for (int i = 0; i < size; i++) {
                System.out.print(word);
            }
        }

    }
}

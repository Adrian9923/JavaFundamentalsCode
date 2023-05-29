package TextProcessing;

import java.util.Scanner;

public class RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        String[] cmdParts = command.split(" ");

        for (int i = 0; i < cmdParts.length; i++) {
            String word = cmdParts[i];
            int length = word.length();
            for (int j = 0; j < length; j++) {
                System.out.print(word);
            }
        }
    }
}

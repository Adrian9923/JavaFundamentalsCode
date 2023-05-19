package ObjectAndClasses;

import java.util.Random;
import java.util.Scanner;

public class RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        String[] words = line.split(" ");

        Random rnd = new Random();
        for (int i = 0; i < words.length; i++) {
            int newIndex = rnd.nextInt(words.length);
            String temp;
            temp = words[i];
            words[i] = words[newIndex];
            words[newIndex] = temp;
        }
        for (String word : words) {
            System.out.println(word);
        }
        // or
       // System.out.println(String.join(System.lineSeparator(), words));

    }
}

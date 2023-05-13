package Methods;

import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int sumVowels = vowelsCount(input);
        System.out.println(sumVowels);
    }
    public static int vowelsCount(String input) {
        int sumVowels = 0;
        for (int i = 0; i < input.length(); i++) {
            char letter = input.charAt(i);
            if (letter == 'a' || letter == 'A' || letter == 'e' || letter == 'E' || letter == 'i' || letter == 'I' || letter == 'o' || letter == 'O' || letter == 'u' || letter == 'U'){
                sumVowels++;
            }
        }
        return sumVowels;
    }
}

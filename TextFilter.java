import java.util.Scanner;

public class TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] bannedWords = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for (String bannedWord : bannedWords) {
          text = text.replace(bannedWord, repeat("*", bannedWord.length()));
        }
        System.out.println(text);

    }
    static  String repeat(String s, int times){
        String[] repetitions = new String[times];

        for (int i = 0; i < times; i++) {
            repetitions[i] = s;
        }
        return String.join("", repetitions);
    }

}

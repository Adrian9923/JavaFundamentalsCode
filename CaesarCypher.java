package TextProcessing;

import java.util.Scanner;

public class CaesarCypher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String cypher = "";
        for (int i = 0; i < text.length(); i++) {
            char letter = text.charAt(i);
            letter += (char) 3;
            cypher += letter;
        }
        System.out.println(cypher);
    }
}

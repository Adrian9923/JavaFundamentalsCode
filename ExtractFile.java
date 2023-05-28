package TextProcessing;

import java.util.Scanner;

public class ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        String[] cmdParts = command.split("\\\\"); // or String[] cmdParts = command.split(Pattern.quote("\\"));

        String extract = cmdParts[3];
        String[] extractParts = extract.split("\\.");
        String fileName = extractParts[0];
        String extension = extractParts[1];

        System.out.printf("File name: %s\n",fileName);
        System.out.printf("File extension: %s",extension);
    }
}

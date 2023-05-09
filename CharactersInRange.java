package Methods;

import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char c1 = scanner.nextLine().charAt(0);
        char c2 = scanner.nextLine().charAt(0);
        printChar(c1, c2);
    }
    private static void printChar(char c1, char c2) {
        for (char i = c1; i < c2; i++) {
            if (i != c1)
            System.out.print(i + " ");
        }
    }
}

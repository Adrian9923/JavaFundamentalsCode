package Methods;

import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        printMiddleChar(input);
    }

    public static void printMiddleChar(String input) {
        int right = 0;
        for (int i = 0; i < input.length(); i++) {
            right++;
        }
        int left = 0;
        for (int i = 0; i < input.length(); i++) {
            char element = input.charAt(i);
            right--;
            if (input.length() % 2 == 1) {
                if (left == right) {
                    System.out.println(element);
                }
            }else {
             if (left == right) {
                 System.out.println(element);
             }
            }
            left++;
        }
    }
}

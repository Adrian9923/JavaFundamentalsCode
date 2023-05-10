package Methods;

import java.util.Scanner;

public class MiddleCharacterV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        getMiddleChar(input);
    }
    public static void getMiddleChar(String  input) {
        int length = input.length();
        if (length % 2 == 0) {
            char ch = input.charAt((length / 2) - 1);
            char ch2 = input.charAt(length / 2);
            System.out.print("" + ch + ch2);
        }else {
            char ch = input.charAt(length / 2);
            System.out.println(ch);
        }
    }
}

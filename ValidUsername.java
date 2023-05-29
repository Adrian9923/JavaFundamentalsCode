package TextProcessing;

import java.util.Scanner;

public class ValidUsername {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] passwords = scanner.nextLine().split(", ");
        for (String password : passwords) {
            if (validate(password)) {
                System.out.println(password);
            }
        }

    }



    private static boolean validate(String username) {
        if (username.length() < 3 || username.length() > 16) {
            return false;
        }
        for (int i = 0; i < username.length(); i++) {
            char symbol = username.charAt(i);

            if (!Character.isLetterOrDigit(symbol) &&
            symbol != '-' && symbol != '_') {
                return false;
            }
        }
        return true;
    }
}

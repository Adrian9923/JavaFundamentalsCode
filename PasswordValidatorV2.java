package Methods;

import java.util.Scanner;

public class PasswordValidatorV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        passwordValid(password);
    }

    public static void passwordValid(String password) {
        boolean length = false;
        boolean lettersDigits = true;
        boolean digits2 = false;
        int countDigits = 0;

        if (password.length() >= 6 && password.length() <= 10){
            length = true;
        }else {
            System.out.println("Password must be between 6 and 10 characters");
        }
        for (int i = 0; i < password.length(); i++) {
            char current = password.charAt(i);
            if ((int) current >= 48 && (int) current <= 57){
                countDigits++;
            }
            if ((int) current < 48 || (int) current > 122 ||
                    ((int) current > 90 && (int) current < 97) ||
                    ((int) current > 57 && (int) current < 65)) {
                lettersDigits = false;
            }
        }
        if (!lettersDigits) {
            System.out.println("Password must consist only of letters and digits");
        }
        if (countDigits < 2) {
            System.out.println("Password must have at least 2 digits");
        }
        else {
            digits2 = true;
        }
        if (length && lettersDigits && digits2) {
            System.out.println("Password is valid");
        }
    }
}

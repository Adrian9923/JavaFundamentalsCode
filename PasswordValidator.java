package Methods;


import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        passwordCheck(input);

    }

    public static void passwordCheck(String input) {
        int lastLetter = 0;
        for (int i = 0; i < input.length(); i++) {
            char letter = input.charAt(i);
            if (Character.isDigit(letter) || Character.isAlphabetic(letter)){
                if ((input.length() >= 6 && input.length() <= 10) && (digitCount(input) >= 2)){
                    if (lastLetter == input.length() - 1){
                        System.out.println("Password is valid");
                    }
                    lastLetter++;
                }
                else if (input.length() < 6 && digitCount(input) < 2){
                    System.out.println("Password must be between 6 and 10 characters");
                    System.out.println("Password must have at least 2 digits");
                    break;
                }else if (input.length() < 6 || input.length() > 10){
                    System.out.println("Password must be between 6 and 10 characters");
                    break;
                }
            }else {
                    System.out.println("Password must consist only of letters and digits");
                    System.out.println("Password must have at least 2 digits");
                    break;
            }
        }
    }

    public static int digitCount(String input) {
        int result = 0;
        for (int i = 0; i < input.length(); i++) {
            char letter = input.charAt(i);
            if (Character.isDigit(letter))
                result++;
        }
        return result;
    }
}

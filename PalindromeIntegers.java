package Methods;

import java.util.Scanner;

public class PalindromeIntegers {
    public static void main(String[] args) {
        printPalindrome();
    }

    public static void printPalindrome() {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        String backWards = "";
        while (!command.equals("END")){
                for (int i = command.length() - 1; i >= 0; i--) {
                    char element = command.charAt(i);
                    backWards += element;
                }
                if (command.equals(backWards)){
                    System.out.println("true");
                }else
                    System.out.println("false");
             backWards = "";
            command = scanner.nextLine();
        }
    }
}

package TextProcessing;

import java.util.Scanner;

public class StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder result = new StringBuilder(scanner.nextLine());
        int power = 0;
        for (int i = 0; i < result.length(); i++) {
            if (result.charAt(i) == '>') {
                power += Character.getNumericValue(result.charAt(i + 1));
            }else if (power > 0 && result.charAt(i) != '>') {
                result.deleteCharAt(i);
                power--;
                i--;
            }
        }
        System.out.println(result);
    }
}

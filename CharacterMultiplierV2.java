package TextProcessing;

import java.util.Scanner;

public class CharacterMultiplierV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line1 = scanner.nextLine();
        String line2 = scanner.nextLine();
        char[] arr1 = line1.toCharArray();
        char[] arr2 = line2.toCharArray();

        int shortest = Math.min(arr1.length, arr2.length);
        int sum = 0;
        for (int i = 0; i < shortest; i++) {
            sum += arr1[i] * arr2[i];
        }
        int longest = Math.max(arr1.length, arr2.length);
        char[] finalElements = longest == arr1.length ? arr1 : arr2;
        for (int i = longest - 1; i >= shortest; i--) {
            sum += finalElements[i];
        }
        System.out.println(sum);
    }
}

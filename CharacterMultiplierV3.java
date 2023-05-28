package TextProcessing;

import java.util.Scanner;

public class CharacterMultiplierV3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var input = scanner.nextLine().split(" ");

        char[] arr1 = input[0].toCharArray();
        char[] arr2 = input[1].toCharArray();

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

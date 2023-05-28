package TextProcessing;

import java.util.Scanner;

public class CharacterMultiplierV4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        String[] lineParts = line.split(" ");
        int totalSum = 0;
        int sumOfEqualArrays = calcSum(line);
        totalSum += sumOfEqualArrays;
        if (lineParts[0].length() > lineParts[1].length()) {
            int remainingSum = remainingSum(lineParts[0], lineParts[1]);
            totalSum += remainingSum;
        }else if (lineParts[1].length() > lineParts[0].length()) {
            int remainingSum = remainingSum(lineParts[1], lineParts[0]);
            totalSum += remainingSum;
        }
        System.out.println(totalSum);
    }


    private static int calcSum(String line) {
        int sum = 0;
        String[] lineParts = line.split(" ");
        char[] arr1 = lineParts[0].toCharArray();
        char[] arr2 = lineParts[1].toCharArray();
        for (int i = 0; i < Math.min(arr1.length, arr2.length); i++) {
            sum += arr1[i] * arr2[i];
        }
        return sum;
    }

    private static int remainingSum(String longest, String shortest) {
        int sum = 0;
        char[] arr1 = longest.toCharArray();
        char[] arr2 = shortest.toCharArray();
        for (int i = arr2.length; i < arr1.length; i++) {
            sum += arr1[i];
        }
        return sum;
    }
}

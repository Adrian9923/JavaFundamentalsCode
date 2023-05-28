package TextProcessing;

import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line1 = scanner.nextLine();
        String line2 = scanner.nextLine();
        int totalSum = 0;
        int sumOfEqualArrays = calcSum(line1,line2);
        totalSum += sumOfEqualArrays;
        if (line1.length() > line2.length()) {
            int remainingSum = remainingSum(line1,line2);
            totalSum += remainingSum;
        }else if (line2.length() > line1.length()) {
            int remainingSum = remainingSum(line2, line1);
            totalSum += remainingSum;
        }
        System.out.println(totalSum);
    }


    private static int calcSum(String line1, String line2) {
        int sum = 0;
        char[] arr1 = line1.toCharArray();
        char[] arr2 = line2.toCharArray();
        for (int i = 0; i < Math.min(arr1.length, arr2.length); i++) {
            sum += arr1[i] * arr2[i];
        }
        return sum;
    }

    private static int remainingSum(String longerString, String shorterString) {
        int sum = 0;
        char[] arr1 = longerString.toCharArray();
        char[] arr2 = shorterString.toCharArray();
        for (int i = arr2.length; i < arr1.length; i++) {
            sum += arr1[i];
        }
        return sum;
    }
}

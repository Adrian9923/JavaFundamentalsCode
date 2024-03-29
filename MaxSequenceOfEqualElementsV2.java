package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElementsV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        int maxCount = 0;
        int digit = 0;
        int counter = 1;
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] == numbers[i + 1]){
                counter++;
                if (counter > maxCount) {
                    maxCount = counter;
                    digit = numbers[i];
                }
            }else
                counter = 1;
        }
        for (int i = 0; i < maxCount; i++) {
            System.out.print(digit + " ");
        }
    }
}

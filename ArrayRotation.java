package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();
        int rotations = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < rotations; i++) {
            int temp = numbers[0];
            for (int j = 0; j < numbers.length - 1; j++) {

                numbers[j] = numbers[j + 1];
            }
            numbers[numbers.length - 1] = temp;
        }
        for (int number : numbers) {
            System.out.print(number + " ");
        }

    }
}

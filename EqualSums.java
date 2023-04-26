package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        int sumRight = 0;
        for (int number : numbers) {
            sumRight += number;
        }
        int sumLeft = 0;
        for (int i = 0; i < numbers.length; i++) {
            sumRight -= numbers[i];
            if (sumLeft == sumRight) {
                System.out.println(i);
                return;
            }
            sumLeft += numbers[i];
        }
        System.out.println("no");
    }
}

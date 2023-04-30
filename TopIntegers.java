package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] integers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        for (int i = 0; i < integers.length; i++) {
            boolean isBigger = true;
            for (int j = i + 1; j < integers.length; j++) {
                if (integers[i] <= integers[j]) {
                    isBigger = false;
                }
            }
            if (isBigger) {
                System.out.print(integers[i] + " ");
            }
        }
    }
}

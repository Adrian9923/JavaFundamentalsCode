package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            int[] input = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(e -> Integer.parseInt(e))
                    .toArray();
            for (int j = 0; j < input.length - 1; j++) {
                arr2[i] = input [j];
                arr1[i] = input[j + 1];
            }
        }
        for (int i = 0; i < n; i+=2) {
            int temp = 0;
            temp = arr2[i];
            arr2[i] = arr1[i];
            arr1[i] = temp;
        }
        for (int i : arr1) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : arr2) {
            System.out.print(i + " ");
        }

    }
}

package com.company;

import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] elements1 = scanner.nextLine().split(" ");
        String[] elements2 = scanner.nextLine().split(" ");
        int[] arr1 = new int[elements1.length];
        int[] arr2 = new int[elements2.length];
        int sum = 0;
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = Integer.parseInt(elements1[i]);
            arr2[i] = Integer.parseInt(elements2[i]);

            if (arr1[i] != arr2[i]) {
                System.out.printf("Arrays are not identical. Found difference at %d index.",i);
                return;
            }
            sum += arr1[i];
        }
        System.out.printf("Arrays are identical. Sum: %d",sum);
    }
}

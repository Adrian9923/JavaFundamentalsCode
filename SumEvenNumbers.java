package com.company;

import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int[] num = new int[input.length];
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(input[i]);
            if (num[i] % 2 == 0){
                sum += num[i];
            }
        }
        System.out.println(sum);
    }
}

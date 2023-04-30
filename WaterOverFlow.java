package com.company;

import java.util.Scanner;

public class WaterOverFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int capacity = 255;
        int sum = 0;
        int n = scanner.nextInt();
        int prevSum = 0;
        for (int i = 0; i < n; i++) {
            int liters = scanner.nextInt();
            sum += liters;
            prevSum += liters;
            if (sum > capacity){
                System.out.println("Insufficient capacity!");
                sum -= prevSum;
            }
            prevSum = 0;

        }
        System.out.println(sum);

    }
}

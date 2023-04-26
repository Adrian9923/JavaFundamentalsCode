package com.company;

import java.util.Scanner;

public class IntegerOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();
        int sum = num1 + num2;
        int divide = sum / num3;
        int result = divide * num4;
        System.out.println(result);
    }
}

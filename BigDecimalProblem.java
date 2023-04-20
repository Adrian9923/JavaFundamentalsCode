package com.company;

import java.util.Scanner;

public class BigDecimalProblem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());
        java.math.BigDecimal sum = new java.math.BigDecimal(0);
        for (int i = 0; i < count; i++) {
            java.math.BigDecimal number = new java.math.BigDecimal(scanner.nextLine());
            sum = sum.add(number);
        }
        System.out.print(sum);
    }
}

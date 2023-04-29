package com.company;

import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startingYield = scanner.nextInt();
        int consumedYield = 26;
        int days = 0;
        int extractedYield = 0;
        while (startingYield >= 100) {
           extractedYield += startingYield - consumedYield;

            startingYield -= 10;
            days++;
        }
        extractedYield -= consumedYield;
        System.out.println(days);
        System.out.println(extractedYield);

    }
}

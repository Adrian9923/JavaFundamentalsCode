package com.company;

import java.util.Scanner;

public class IsSpecial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int digitsSum = 0;
        for (int i = 1; i <= num; i++) {
            int number = i;
            while (number > 0) {
                int lastDigit = number % 10;
                digitsSum += lastDigit;
                number /= 10;
            }
            if (digitsSum == 5 || digitsSum == 7 || digitsSum == 11){
                System.out.printf("%d -> True\n",i);
            }
            else
                System.out.printf("%d -> False\n",i);
            digitsSum = 0;
        }
    }
}

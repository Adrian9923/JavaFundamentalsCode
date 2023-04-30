package com.company;

import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] passengers = new int[n];
        int totalPassengers = 0;
        for (int i = 0; i < passengers.length; i++) {
            passengers[i] = scanner.nextInt();
            totalPassengers += passengers[i];
        }
        for (int passenger : passengers) {
            System.out.print(passenger + " ");
        }
        System.out.println();
        System.out.print(totalPassengers);
    }
}

package com.company;

import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numPeople = scanner.nextInt();
        int capacity = scanner.nextInt();
        int counter = 0;
        for (int i = 0; i < numPeople; i+=capacity) {
            counter++;
        }
        System.out.println(counter);
    }
}

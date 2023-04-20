package com.company;

import java.util.Scanner;

public class CharLowerOrUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char letter = scanner.nextLine().charAt(0);
        if (Character.isUpperCase(letter))
            System.out.print("upper-case");
        else
            System.out.print("lower-case");
    }
}

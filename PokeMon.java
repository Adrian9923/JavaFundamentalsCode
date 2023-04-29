package com.company;

import java.util.Scanner;

public class PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pokePower = scanner.nextInt();
        int originalValue = pokePower;
        int distance = scanner.nextInt();
        int exhaust = scanner.nextInt();
        int pokedTargets = 0;
        while (pokePower >= distance) {
            pokePower -= distance;
            pokedTargets++;
            if (pokePower == originalValue / 2){
                pokePower /= exhaust;
            }
        }
        System.out.println(pokePower);
        System.out.println(pokedTargets);
    }
}

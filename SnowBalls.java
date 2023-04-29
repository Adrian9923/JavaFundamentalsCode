package com.company;

import java.util.Scanner;

public class SnowBalls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countSnowballs = scanner.nextInt();
        double prevResult = 0;
        double snow = 0;
        double time = 0;
        double quality = 0;
        double snowballValue = 0;
        for (int i = 0; i < countSnowballs; i++) {
            double snowBallSnow = scanner.nextInt();
            double snowballTime = scanner.nextInt();
            double snowballQuality = scanner.nextInt();
            snowballValue = Math.pow((snowBallSnow / snowballTime), snowballQuality);
            if (snowballValue > prevResult){
                snow = snowBallSnow;
                time = snowballTime;
                quality = snowballQuality;
                prevResult += snowballValue;

            }
        }
        System.out.printf("%.0f : %.0f = %.0f (%.0f)",snow,time,prevResult,quality);
    }
}

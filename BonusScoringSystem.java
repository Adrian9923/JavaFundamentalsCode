package Exam;

import java.util.Scanner;

public class BonusScoringSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int students = scanner.nextInt();
        double lectures = scanner.nextInt();
        double additionalBonus = scanner.nextInt();
        double max = Double.NEGATIVE_INFINITY;
        double totalBonus;
        int attendedLectures = 0;
        for (int i = 0; i < students; i++) {
            int studentAttendances = scanner.nextInt();
            totalBonus = Math.ceil((studentAttendances / lectures) * (5 + additionalBonus));
            if (totalBonus >= max) {
                max = totalBonus;
                attendedLectures = studentAttendances;
            }
        }
        System.out.printf("Max Bonus: %.0f.\n",max);
        System.out.printf("The student has attended %d lectures.",attendedLectures);
    }
}

package ExamPrep;

import java.util.Scanner;

public class SoftUniReception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstEmployee = scanner.nextInt();
        int secondEmployee = scanner.nextInt();
        int thirdEmployee = scanner.nextInt();
        int totalPeople = scanner.nextInt();

        int hours = 0;
        int totalHelpedPeoplePerHour = firstEmployee + secondEmployee + thirdEmployee;
        while (totalPeople > 0) {
           hours++;
           if (hours % 4 == 0) {
               continue;
           }
           totalPeople -= totalHelpedPeoplePerHour;
        }
        System.out.printf("Time needed: %dh.",hours);
    }
}

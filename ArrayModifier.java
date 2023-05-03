package ExamPrep;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        String command = scanner.nextLine();
        while (!command.equals("end")) {
            String[] cmdParts = command.split(" ");
            switch (cmdParts[0]) {
                case "multiply": {
                    numbers[Integer.parseInt(cmdParts[1])] = numbers[Integer.parseInt(cmdParts[1])] * numbers[Integer.parseInt(cmdParts[2])];
                    break;
                }
                case "decrease": {
                    for (int i = 0; i < numbers.length; i++) {
                        numbers[i] -= 1;
                    }
                    break;
                }
                case "swap": {
                    int temp = 0;
                    for (int i = 0; i < 1; i++) {
                        int firstValue = Integer.parseInt(cmdParts[1]);
                        int secondValue = Integer.parseInt(cmdParts[2]);
                        temp = numbers[firstValue];
                        numbers[firstValue] = numbers[secondValue];
                        numbers[secondValue] = temp;

                    }
                    break;
                }
            }


            command = scanner.nextLine();
        }
        for (int i = 0; i < numbers.length; i++) {
            if (i + 1 == numbers.length) {
                System.out.printf("%d", numbers[i]);
                break; // or continue;
            }
            System.out.printf("%d, ", numbers[i]);
        }

    }
}

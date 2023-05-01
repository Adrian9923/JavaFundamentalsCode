package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();
        while (!command.equals("End")) {
            String[] cmdParts = command.split(" ");
            if (cmdParts[0].equals("Add")) {
                numbers.add(Integer.parseInt(cmdParts[1]));
            }
            else if (cmdParts[0].equals("Insert")) {
                if (Integer.parseInt(cmdParts[2]) > numbers.size()){
                    System.out.println("Invalid index");
                }else
                numbers.add(Integer.parseInt(cmdParts[2]), Integer.parseInt(cmdParts[1]));

            }
            else if (cmdParts[0].equals("Remove")) {
                if (Integer.parseInt(cmdParts[1]) > numbers.size()){
                    System.out.println("Invalid index");

                }else
                numbers.remove(Integer.parseInt(cmdParts[1]));
            }
            else if ((cmdParts[0] + " " + cmdParts[1]).equals("Shift left")) {
                int rotations = Integer.parseInt(cmdParts[2]);
                for (int i = 0; i < rotations; i++) {
                    int temp = numbers.get(0);
                    for (int j = 0; j < numbers.size() - 1; j++) {

                       numbers.set(j,numbers.get(j + 1));
                    }
                    numbers.set(numbers.size() - 1, temp);
                }
            }
            else if ((cmdParts[0] + " " + cmdParts[1]).equals("Shift right")) {
                int rotations = Integer.parseInt(cmdParts[2]);
                for (int i = 0; i < rotations; i++) {
                    int temp = numbers.get(numbers.size() - 1);
                    for (int j = numbers.size() - 1; j > 0; j--) {

                        numbers.set(j,numbers.get(j - 1));
                    }
                    numbers.set(0, temp);
                }
            }


            command = scanner.nextLine();
        }

        for (Integer number : numbers) {
            System.out.print(number + " ");
        }

    }
}

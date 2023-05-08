package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();
        while (!command.equals("end")) {
            String[] cmdParts = command.split(" ");
            if (cmdParts[0].equals("Delete")) {
                for (int i = 0; i < numbers.size(); i++) {
                    if (numbers.get(i) == Integer.parseInt(cmdParts[1])) {
                        numbers.remove(Integer.valueOf(Integer.parseInt(cmdParts[1]))); // or numbers.remove(numbers.get(i));
                        i = 0;
                    }
                }
            }
            if (cmdParts[0].equals("Insert")) {
                numbers.add(Integer.parseInt(cmdParts[2]), Integer.parseInt(cmdParts[1]));
            }


            command = scanner.nextLine();
        }
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }

    }
}

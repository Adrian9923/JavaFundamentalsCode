package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        String input = scanner.nextLine();

        String[] tokens = input.split(" ");
        int specialNumber = Integer.parseInt(tokens[0]);
        int power = Integer.parseInt(tokens[1]);
        int minimum = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.size(); i++) {
            if (specialNumber == numbers.get(i)) {
                numbers.set(i, minimum);

                for (int j = 0; j < power; j++) {
                    if (i - 1 - j >= 0) {
                        numbers.set(i - 1 - j, minimum);
                    }

                    if (i + 1 + j <= numbers.size() - 1) {
                        numbers.set(i + 1 + j, minimum);
                    }
                }
            }
        }

        numbers.removeIf(n -> n == minimum);

        int sum = 0;

        for (Integer number : numbers) {
            sum += number;
        }

        System.out.println(sum);

    }
}

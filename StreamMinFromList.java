package AssociativeArrays;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class StreamMinFromList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).toList();
        int min = numbers.stream().mapToInt(n -> n).min().orElse(0);
        System.out.print(min);
    }
}

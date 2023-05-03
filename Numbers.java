package ExamPrep;

import java.util.*;
import java.util.stream.Collectors;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> topNumbers = new ArrayList<>();

        double average = 0;
        for (int i = 0; i < numbers.size(); i++) {
            average += numbers.get(i);
        }
        for (int i = 0; i < numbers.size(); i++) {
            if ((numbers.get(i) > average / numbers.size())) {
                topNumbers.add(numbers.get(i));
            }
        }
        Collections.sort(topNumbers);
        Collections.reverse(topNumbers);
        if (topNumbers.isEmpty()) {
            System.out.print("No");
        }else {
            if (topNumbers.size() < 5) {
                for (Integer topNumber : topNumbers) {
                    System.out.print(topNumber + " ");
                }
            }else {
                for (int i = 0; i < 5; i++) {
                    System.out.print(topNumbers.get(i) + " ");
                }
            }

        }
    }
}

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Largest3Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = numbersParse(scanner.nextLine());

        if (numbers.size() > 3){
            Collections.sort(numbers);
            Collections.reverse(numbers);
            for (int i = 0; i < 3; i++) {
                System.out.print(numbers.get(i) + " ");
            }

        }else {
            Collections.sort(numbers);
            Collections.reverse(numbers);
            for (int number : numbers) {
                System.out.print(number + " ");
            }

        }


    }
    static List<Integer> numbersParse(String line){
        String[] items = line.split(" ");
        List<Integer> numbers = new ArrayList<>();
        for (String item : items) {
            numbers.add(Integer.parseInt(item));
        }
        return numbers;
    }
}

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = parseNumbers(scanner.nextLine());
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) < 0){
                numbers.remove(numbers.get(i));
                i = -1;
            }
            if (numbers.isEmpty()){
                System.out.println("empty");
            }


        }
        Collections.reverse(numbers);
        for (int number : numbers) {
            System.out.print(number + " ");
        }


    }

    static List<Integer> parseNumbers(String line){
        String[] elements = line.split(" ");
        List<Integer> numbers = new ArrayList<>();
        for (String element : elements) {
            numbers.add(Integer.parseInt(element));
        }
        return numbers;
    }
}

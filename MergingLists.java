import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> firstList = parseNumbers(scanner.nextLine());
        List<Integer> secondList = parseNumbers(scanner.nextLine());
        List<Integer> finalList = new ArrayList<>();

        for (int i = 0; i < Math.max(firstList.size(), secondList.size()); i++) {
            if (firstList.size() > i){
                finalList.add(firstList.get(i));
            }
            if ( secondList.size() > i){
                finalList.add(secondList.get(i));
            }
        }

        for (int integer : finalList) {
            System.out.print(integer + " ");
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

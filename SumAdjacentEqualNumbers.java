import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> numbers = parseInt(scanner.nextLine());
        int index = 0;

        while (index < numbers.size() - 1){
            int nextIndex = index + 1;

            double currentItem = numbers.get(index);
            double nextItem = numbers.get(nextIndex);
            if(currentItem == nextItem){
               double sum = currentItem + nextItem;
               numbers.set(index , sum);
               numbers.remove(nextIndex);
               index = 0;
            }else {
                index++;
            }

        }



        for (double number : numbers) {
            System.out.print(new DecimalFormat("0.#").format(number) + " ");
        }


    }

    static List<Double> parseInt(String line) {
        String[] splitLine = line.split(" ");
        List<Double> numbers = new ArrayList<>();
        for (String item : splitLine) {
            numbers.add(Double.parseDouble(item));
        }
        return numbers;
    }
}

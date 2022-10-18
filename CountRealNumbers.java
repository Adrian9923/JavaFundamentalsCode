import java.util.*;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] items = scanner.nextLine().split(" ");
        Map<Integer,Integer> numberOccurrences = new TreeMap<>();

        for (String item : items) {
            int number = Integer.parseInt(item);

            Integer occurrences = numberOccurrences.get(number);
            if(occurrences == null) {
                numberOccurrences.put(number, 1);
            }else {
                numberOccurrences.put(number,occurrences + 1);
            }

        }
        for (Map.Entry<Integer, Integer> entry : numberOccurrences.entrySet()) {
            System.out.printf("%d -> %d\n",entry.getKey(),entry.getValue());
        }

    }
}

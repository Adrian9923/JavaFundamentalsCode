package AssociativeArrays;

import java.util.*;

public class OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = Arrays.stream(scanner.nextLine().split(" "))
                .map(String::toLowerCase)
                .toArray(String[]::new);

        Map<String,Integer> counts = new LinkedHashMap<>();

        for (String word : words) {
            if (!counts.containsKey(word)){
                counts.put(word, 0);
            }
            counts.put(word, counts.get(word) + 1);

        }

        List<String> results = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : counts.entrySet()) {
            if (entry.getValue() % 2 == 1) {
                results.add(entry.getKey());
            }
        }

        System.out.print(String.join(", ",results));
    }
}

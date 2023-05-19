package AssociativeArrays;

import java.util.*;

public class PrototypeWordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> words = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();
            if (!words.containsKey(word)) {
                words.put(word, new ArrayList<>());
                words.get(word).add(synonym);
            }else {
                words.get(word).add(synonym);
            }
        }
        for (Map.Entry<String, List<String>> entry : words.entrySet()) {
            System.out.printf("%s - %s\n",entry.getKey(),String.join(", ", entry.getValue()));
        }

    }
}

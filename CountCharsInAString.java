package AssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        char[] chars = input.toCharArray();

        Map<Character,Integer> count = new LinkedHashMap<>();

        for (char ch : chars) {
            count.putIfAbsent(ch, 0);
            count.put(ch, count.get(ch) + 1);
        }

        for (Map.Entry<Character, Integer> entry : count.entrySet()) {
            if (!entry.getKey().equals(' ')) {
                System.out.printf("%c -> %d\n",entry.getKey(),entry.getValue());
            }
        }

    }
}

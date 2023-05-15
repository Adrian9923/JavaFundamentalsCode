package AssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> counts = new LinkedHashMap<>();

        String command = scanner.nextLine();
        while (!command.equals("stop")) {
            Integer value = Integer.parseInt(scanner.nextLine());

          if (!counts.containsKey(command)) {
              counts.put(command, value);
          }else
            counts.put(command, counts.get(command) + value);
            command = scanner.nextLine();
        }

        for (Map.Entry<String, Integer> entry : counts.entrySet()) {
            System.out.printf("%s -> %d\n",Character.toUpperCase(entry.getKey().charAt(0)) + entry.getKey().substring(1),entry.getValue());
        }

    }
}

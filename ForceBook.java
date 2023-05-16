package AssociativeArrays;

import java.util.*;

public class ForceBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> records = new LinkedHashMap<>();

        String command = scanner.nextLine();
        while (!command.equals("End")) {
            String[] cmdParts = command.split(" ");
            String delimiter = cmdParts[1];

            switch (delimiter) {
                case "|": {
                    String forceSide = cmdParts[0];
                    String forceUser = cmdParts[2];
                    if (!records.containsKey(forceSide)) {
                        records.put(forceSide, new ArrayList<>());
                        records.get(forceSide).add(forceUser);
                    }
                    else {
                        records.get(forceSide).add(forceUser);
                    }
                    break;
                }
                case "->": {
                    String forceUser = cmdParts[0];
                    String forceSide = cmdParts[2];
                    if (forceSide.equals("Lighter")){
                        System.out.printf("%s joins the %s side",forceUser,forceSide);

                    }else {
                        System.out.printf("%s joins the %s side",forceUser,forceSide);
                    }
                }
            }

            command = scanner.nextLine();
        }
        for (Map.Entry<String, List<String>> entry : records.entrySet()) {
            System.out.printf("%s:\n",entry.getKey());
            System.out.printf("! %s\n",String.join("",entry.getValue()));
        }

    }
}

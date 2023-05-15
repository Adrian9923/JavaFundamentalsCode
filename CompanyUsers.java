package AssociativeArrays;

import java.util.*;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> records = new TreeMap<>();

        String command = scanner.nextLine();
        while (!command.equals("End")) {
            String[] cmdParts = command.split(" -> ");
            String companyName = cmdParts[0];
            String employeeId = cmdParts[1];

            if (!records.containsKey(companyName)) {
                records.put(companyName, new ArrayList<>());
                records.get(companyName).add(employeeId);
            }else {
                records.get(companyName).add(employeeId);
            }

            command = scanner.nextLine();
        }

        records.entrySet().stream().sorted((n1,n2) -> n1.getKey().compareTo(n2.getKey()))
                .forEach(pair -> {
                    System.out.printf("%s\n",pair.getKey());
                    System.out.printf("-- %s\n",String.join("\n-- ", pair.getValue()));
                });
    }
}

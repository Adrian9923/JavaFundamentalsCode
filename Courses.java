package AssociativeArrays;

import java.util.*;

public class Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> registrations = new LinkedHashMap<>();

        String command = scanner.nextLine();
        while (!command.equals("end")) {
            String[] cmdParts = command.split(" : ");
            String courseName = cmdParts[0];
            String studentName = cmdParts[1];
            registrations.putIfAbsent(courseName, new ArrayList<>());
            registrations.get(courseName).add(studentName);

            command = scanner.nextLine();
        }

        for (Map.Entry<String, List<String>> entry : registrations.entrySet()) {
            int counter = 0;
            for (int i = 0; i < entry.getValue().size(); i++) {
                counter++;
            }
            System.out.printf("%s: %d\n",entry.getKey(),counter);
            System.out.printf("-- %s\n",String.join("\n-- ", entry.getValue()));
        }
    }
}

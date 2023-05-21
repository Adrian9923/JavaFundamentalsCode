package ExamPrep;

import java.util.*;

public class InboxManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> users = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("Statistics")) {

            String[] tokens = input.split("->");
            String command = tokens[0];
            String username = tokens[1];

            if (command.equals("Add")) {
                if (users.containsKey(username)) {
                    System.out.printf("%s is already registered\n", username);
                } else {
                    users.put(username, new ArrayList<>());
                }
            } else if (command.equals("Send")) {
                String email = tokens[2];
                users.get(username).add(email);
            } else if (command.equals("Delete")) {
                if (users.containsKey(username)) {
                    users.remove(username);
                }else {
                    System.out.printf("%s not found!\n",username);
                }
            }

                input = scanner.nextLine();
        }
        System.out.println("Users count: " + users.size());
        users.entrySet()
                .stream()
                .sorted((f,s) -> {
                    int result = Integer.compare(s.getValue().size(), f.getValue().size());
                    if (result == 0) {
                        result = f.getKey().compareTo(s.getKey());
                    }

                    return result;
                })
                .forEach(entry -> {
                    System.out.println(entry.getKey());
                    entry.getValue().forEach(email -> System.out.println(" - " + email));
                });
    }
}

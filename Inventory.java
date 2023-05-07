package Exam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Inventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> inventory = Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());


        String command = scanner.nextLine();
        while (!command.equals("Craft!")) {
            String[] cmdParts = command.split(" - ");
            switch (cmdParts[0]) {
                case "Collect": {
                    inventory.add(cmdParts[1]);
                    break;
                }
                case "Drop": {
                    for (int i = 0; i < inventory.size(); i++) {
                        if (inventory.get(i).equals(cmdParts[1])){
                            inventory.remove(inventory.get(i));
                        }
                    }
                    break;
                }
                case "Combine Items": {
                    String[] parts = cmdParts[1].split(":");
                    String oldItem = parts[0];
                    String newItem = parts[1];
                    for (int i = 0; i < inventory.size(); i++) {
                        if (inventory.get(i).equals(oldItem)){
                            inventory.add(i + 1, newItem);
                            break;
                        }
                    }
                    break;
                }
                case "Renew": {
                    for (int i = 0; i < inventory.size(); i++) {
                        if (inventory.get(i).equals(cmdParts[1])){
                            inventory.remove(inventory.get(i));
                        }
                    }
                    inventory.add(cmdParts[1]);
                    break;
                }
            }


            command = scanner.nextLine();
        }
        for (int i = 0; i < inventory.size(); i++) {
            if (i + 1 == inventory.size()) {
                System.out.printf("%s", inventory.get(i));
                break; // or continue;
            }
            System.out.printf("%s, ", inventory.get(i));
        }

    }
}

package AssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Parking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String,String> registrations = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String command = scanner.nextLine();
            String[] cmdParts = command.split(" ");
            String action = cmdParts[0];
            switch (action) {
                case "register": {
                    String name = cmdParts[1];
                    String licensePlate = cmdParts[2];
                    if (!registrations.containsKey(name)) {
                        System.out.printf("%s registered %s successfully\n",name,licensePlate);
                        registrations.put(name, licensePlate);
                    }
                    else {
                        System.out.printf("ERROR: already registered with plate number %s\n",licensePlate);
                    }
                    break;
                }
                case "unregister": {
                    String name = cmdParts[1];
                    System.out.printf("%s unregistered successfully\n",name);
                    registrations.remove(name);
                    break;
                }
            }
        }

        for (Map.Entry<String, String> entry : registrations.entrySet()) {
            System.out.printf("%s => %s\n",entry.getKey(),entry.getValue());
        }

    }
}

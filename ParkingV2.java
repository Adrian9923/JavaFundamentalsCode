package AssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ParkingV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());
        Map<String, String> registeredVehicles = new LinkedHashMap<>();

        while (n-- > 0){
            String[] inputCommand = scanner.nextLine().split("\\s+");

            if (inputCommand[0].equalsIgnoreCase("register")){
                registerVehicle(inputCommand, registeredVehicles);
            } else if (inputCommand[0].equalsIgnoreCase("unregister")){
                unregisterVehicle(inputCommand, registeredVehicles);
            }

        }

        registeredVehicles.entrySet().forEach(kvp -> System.out.println(String.format("%s => %s", kvp.getKey(), kvp.getValue())));


    }

    private static void unregisterVehicle(String[] inputCommand, Map<String, String> registeredVehicles) {
        String personName = inputCommand[1];

        if (registeredVehicles.containsKey(personName)){
            registeredVehicles.remove(personName);
            System.out.println(String.format("%s unregistered successfully", personName));
        } else {
            System.out.println(String.format("ERROR: user %s not found", personName));
        }


    }

    private static void registerVehicle(String[] inputCommand, Map<String, String> registeredVehicles) {
        String personName = inputCommand[1];
        String license = inputCommand[2];

        if (registeredVehicles.containsKey(personName)){
            System.out.println(String.format("ERROR: already registered with plate number %s", registeredVehicles.get(personName)));
        } else {
            registeredVehicles.put(personName, license);
            System.out.println(String.format("%s registered %s successfully", personName, license));
        }

    }
}
